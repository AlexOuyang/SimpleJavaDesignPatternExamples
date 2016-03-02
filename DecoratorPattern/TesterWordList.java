/**
 * This is the driver class for testing the decorator pattern
 *
 * Description:
 *=======================================================================+
 * WordListInterface <interface>: This is a word list container interface
 * +toString()
 * +getWordList()
 *=======================================================================+
 * WordListDecorator <abstract class implements WordListInterface>:
 * +WordList specialWordListToBeDecorated
 * +toString()
 *=======================================================================+
 * SimpleWordList <concrete class>: This is a concrete implementation of the word list container
 * +List<String> words
 * +toString()
 * +getWordList()
 *=======================================================================+
 * RemoveGreaterWordListDecorator: <extends WordListDecorator>:
 * +removeGreaterWords()
 *=======================================================================+
 * ReverseListWordListDecorator: <extends WordListDecorator>:
 * +reverseList()
 *=======================================================================+
 * UpperCaseDecorator: <extends WordListDecorator>:
 * +toUpperCase()
 *=======================================================================+
 */

import java.util.*;


public class TesterWordList {

    public static void main(String[] args) {
        // Decorate the SimpleWordList with all functionalities

        for (int i = 0; i < 5; i++) System.out.println("\n");
        System.out.println("Test 1\n");

        // Test 1
        String[] l_array = {"a", "b", "c", "e", "f", "g", "h", "i", "j"};
        List l1 = new ArrayList<String>(Arrays.asList(l_array));
        List l2 = new ArrayList<String>(Arrays.asList(l_array));
        List l3 = new ArrayList<String>(Arrays.asList(l_array));

        WordList list1 = new SimpleWordList(l1);
        WordList list2 = new SimpleWordList(l2);
        WordList list3 = new SimpleWordList(l3);


        System.out.println("Original List: " + list1.toString());

        // Test for upper case decorator
        UpperCaseWordListDecorator decoratedUpperCaseObj = new UpperCaseWordListDecorator(list1);
        decoratedUpperCaseObj.toUpperCase();
        System.out.println("Upper Cased List: " + decoratedUpperCaseObj.toString());


        // Test for remove gerater word decorator
        RemoveGreaterWordListDecorator decoratedRemoveGreaterObj = new RemoveGreaterWordListDecorator(list2);
        decoratedRemoveGreaterObj.removeGreaterWords("e");
        System.out.println("Removed Greater List (remove elements greater than e): " + decoratedRemoveGreaterObj.toString());

        // Test for reverse list decorator
        ReverseListWordListDecorator decoratedReverseListObj = new ReverseListWordListDecorator(list3);
        decoratedReverseListObj.reverseList();
        System.out.println("Reverse List: " + decoratedReverseListObj.toString());


        for (int i = 0; i < 3; i++) System.out.println("\n");

        System.out.println("Test 2\n");
        // Test 2
        String[] l_array2 = {"abase", "abbess", "abbey", "abbot", "abdicate"};
        l1 = new ArrayList<String>(Arrays.asList(l_array2));
        l2 = new ArrayList<String>(Arrays.asList(l_array2));
        l3 = new ArrayList<String>(Arrays.asList(l_array2));

        list1 = new SimpleWordList(l1);
        list2 = new SimpleWordList(l2);
        list3 = new SimpleWordList(l3);

        System.out.println("Original List: " + list1.toString());

        // Test for upper case decorator
        decoratedUpperCaseObj = new UpperCaseWordListDecorator(list1);
        decoratedUpperCaseObj.toUpperCase();
        System.out.println("Upper Cased List: " + decoratedUpperCaseObj.toString());


        // Test for remove gerater word decorator
        decoratedRemoveGreaterObj = new RemoveGreaterWordListDecorator(list2);
        decoratedRemoveGreaterObj.removeGreaterWords("abbey");
        System.out.println("Removed Greater List (remove elements greater than abbey): " + decoratedRemoveGreaterObj.toString());

        // Test for reverse list decorator
        decoratedReverseListObj = new ReverseListWordListDecorator(list3);
        decoratedReverseListObj.reverseList();
        System.out.println("Reverse List: " + decoratedReverseListObj.toString());


        for (int i = 0; i < 5; i++) System.out.println("\n");

    }

}
