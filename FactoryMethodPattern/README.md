#Factory Method Pattern (Creational Design Pattern)

The factory method pattern defines an interface for creating an object, but let the subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses


###Why use it:
Centralize the creation and instantiation of objects by having one class responsible for producing objects. It uses factory methods to deal with the problem of creating objects without specifying the exact class of object that will be created. 
This is done by creating object and implemented by child classes via calling a factory method—either specified in an interface class and optionally overridden by derived classes—rather than by calling a constructor.


###When to use it:
The idea behind the Factory Method pattern is that it allows for the case where a client doesn't know what concrete classes it will be required to create at runtime, but just wants to get a class that will do the job. The Factory Method builds on the concept of a simple Factory, but lets the subclasses decide which implementation of the concrete class to use.  You'll see factories used in logging frameworks, and in a lot of scenarios where the client doesn't need to know about the concrete implementations. It's a good approach to encapsulation.


###To run the example:

    to compile:  javac *.java
    to run:      java TesterCoordinate

Referece Articles:  
http://www.tutorialspoint.com/design_pattern/factory_pattern.htm



