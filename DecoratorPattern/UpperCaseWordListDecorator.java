/**
 * UpperCaseDecorator: <extends WordListDecorator>: 
 * +toUpperCase()
 */
import java.util.*;

public class UpperCaseWordListDecorator extends WordListDecorator {

    public UpperCaseWordListDecorator(WordList specialWordListToBeDecorated) {
        super(specialWordListToBeDecorated);
    }

    /** 
     * Change all words to upper case
     */
    public void toUpperCase() {
        List<String> tempList = specialWordListToBeDecorated.getWordList();
        for (int i = 0; i < tempList.size(); i++)
            tempList.set(i, tempList.get(i).toUpperCase());
        specialWordListToBeDecorated.setWordList(tempList);
    }

}