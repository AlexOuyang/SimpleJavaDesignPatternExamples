#Facade Design Pattern (Structural Design Pattern)

Facade provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.


###Why use it (with example):
A facade is an object that provides a simplified interface to a larger body of code, such as a class library. A facade can:
* make a software library easier to use, understand and test, since the facade has convenient methods for common tasks.
* make the library more readable, for the same reason.
* reduce dependencies (coupling) of outside code on the inner workings of a library, since most code uses the facade, thus allowing more flexibility in developing the system.
* wrap a poorly designed collection of APIs with a single well-designed API (as per task needs).


####When to use it:
The Facade design pattern is often used when a system is very complex or difficult to understand because the system has a large number of interdependent classes or its source code is unavailable. This pattern hides the complexities of the larger system and provides a simpler interface to the client. It typically involves a single wrapper class which contains a set of members required by client. These members access the system on behalf of the facade client and hide the implementation details.


### Potential downside:
By introducing the Facade into your code, you will be hardwiring subsystems into the Facade. This is fine if the subsystem never changes, but if it does, your Facade could be broken.


###Facade Example:

OrderFascade is a wrapper class that uses Fascade pattern to incorporate the process of ordering behind a simpler interface via the OrderFascade.


    Compile: javac *.java
    Run: java OrderFascade