/**
 * WordListInterface <interface>: This is a word list container interface
 * +toString()
 * +getWordList()
 */
import java.util.*;

public interface WordList {

    public String toString();

    /*
     * Getter for the decorators to use to access the word list
     * in the component class without changing the component object
     * @return List - the list of words
     */
    public List<String> getWordList();

    /*
     * Setter for the decorators to modify the list in the container
     * @param list - the List to replace
     */
    public void setWordList(List<String> wordList);


}