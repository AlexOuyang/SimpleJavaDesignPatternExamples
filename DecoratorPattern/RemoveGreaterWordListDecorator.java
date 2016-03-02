/**
 * RemoveGreaterWordListDecorator: <extends WordListDecorator>: 
 * +removeGreaterWords()
 */

import java.util.*;

public class RemoveGreaterWordListDecorator extends WordListDecorator {

    public RemoveGreaterWordListDecorator(WordList specialWordListToBeDecorated) {
        super(specialWordListToBeDecorated);
    }

    /**
     * Remove words that are greater (ascii value) than the given word
     */
    public void removeGreaterWords(String word) {
        List<String> tempList = specialWordListToBeDecorated.getWordList();
        int i = 0;
        while(i < tempList.size()) {
            if (tempList.get(i).compareTo(word) > 0) {
                tempList.remove(i);
            } else {
                i++;
            }
        }
        specialWordListToBeDecorated.setWordList(tempList);
    }

}