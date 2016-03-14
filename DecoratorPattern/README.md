# Decorator Pattern (Structural Design Pattern) 

Description:
    Decorator design pattern is used to modify the functionality of an object statically or at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior. We use inheritance or composition to extend the behavior of an object but this is done at compile time and its applicable to all the instances of the class.

How to use it:
    The functionality modification is achieved by designing a new decorator class that wraps the original class. This wrapping could be achieved by the following sequence of steps:

    * Subclass the original "Component" class into a "Decorator" class (see UML diagram);
    * In the Decorator class, add a Component pointer as a field;
    * Pass a Component to the Decorator constructor to initialize the Component pointer;
    * In the Decorator class, redirect all "Component" methods to the "Component" pointer; and
    * In the ConcreteDecorator class, override any Component method(s) whose behavior needs to be modified.

    This pattern is designed so that multiple decorators can be stacked on top of each other, each time adding a new functionality to the overridden method(s).


Why use it:
    The decorator pattern is an alternative to subclassing. Subclassing adds behavior at compile time, and the change affects all instances of the original class; decorating can provide new behavior at run-time for individual objects.

    In some object-oriented programming languages, classes cannot be created at runtime, and it is typically not possible to predict, at design time, what combinations of extensions will be needed. This would mean that a new class would have to be made for every possible combination. By contrast, decorators are objects, created at runtime, and can be combined on a per-use basis. The I/O Streams implementations of both Java and the .NET Framework incorporate the decorator pattern.









Decorator Example:

to compile:  javac *.java
to run:      java TesterWordList


Reference Article: http://www.codeproject.com/Tips/468951/Decorator-Design-Pattern-in-Java


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
 * RemoveGreaterWordListDecorator: extends WordListDecorator:
 * +removeGreaterWords()
 *=======================================================================+
 * ReverseListWordListDecorator: extends WordListDecorator:
 * +reverseList()
 *=======================================================================+
 * UpperCaseDecorator: extends WordListDecorator:
 * +toUpperCase()
 *=======================================================================+
