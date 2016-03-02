/**
 * WordListDecorator <abstract class implements WordListInterface>:
 * +WordList specialWordListToBeDecorated
 * +toString()
 *
 */

import java.util.*;

public abstract class WordListDecorator implements WordList {

    protected WordList specialWordListToBeDecorated;

    public WordListDecorator(WordList specialWordListToBeDecorated) {
        this.specialWordListToBeDecorated = specialWordListToBeDecorated;
    }

    @Override
    public String toString() {
        String retString = "";
        List<String> tempList = specialWordListToBeDecorated.getWordList();
        for (String word : tempList) retString += word + ";";
        return retString;
    }

    @Override
    public List<String> getWordList() {
        return specialWordListToBeDecorated.getWordList();
    }

    @Override
    public void setWordList(List<String> wordList) {
        specialWordListToBeDecorated.setWordList(wordList);
    }
}





