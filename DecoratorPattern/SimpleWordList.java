/**
 * SimpleWordList <concrete class>: This is a concrete implementation of the word list container
 * +List<String> words
 * +toString()
 * +getWordList()
 */
import java.util.*;


public class SimpleWordList implements WordList{

    private List<String> words;


    public SimpleWordList(List<String> words) {
        this.words = words;
    }

    public String toString() {
        String retString = "";
        for (String word : words) retString += word + ";";
        return retString;
    }

    public List<String> getWordList() {
        return words;
    }

    public void setWordList(List<String> wordList) {
        words = wordList;
    }

}