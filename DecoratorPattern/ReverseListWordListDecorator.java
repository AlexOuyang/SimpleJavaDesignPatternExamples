/**
 * ReverseListWordListDecorator: <extends WordListDecorator>: 
 * +reverseList()
 */
import java.util.*;


public class ReverseListWordListDecorator extends WordListDecorator {

    public ReverseListWordListDecorator(WordList specialWordListToBeDecorated) {
        super(specialWordListToBeDecorated);
    }

    /*
     * Reverse the word list
     */
    public void reverseList() {
        List<String> tempList = specialWordListToBeDecorated.getWordList();
        Collections.reverse(tempList);
        specialWordListToBeDecorated.setWordList(tempList);
    }

}