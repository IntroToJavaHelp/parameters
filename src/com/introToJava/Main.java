package com.introToJava;

public class Main
{
    public static void main(String[ ] args)
    {
        sayHello("Frank", 5);
        final String someName = "Joe";
        final int someAmount = 3;
        sayHello(someName, someAmount);
    }

    /**
     *
     * Greets a given name a give amount of times
     *
     * @param name Name of person to greet
     * @param times Amount of times to greet ${name}
     */
    public static void sayHello(String name, int times)
    {
        /* the formal parameters are (String, int).
        * this means that all calls to "sayHello" must have the actual
        * paramaters of (String, int). These parameters can
        * be literals, like for example:
        *   sayHello("Bob", 4);
        * or variables with the same types as the formal parameters
        * example:
        *       final String someName = "Joe";
        *       final int someAmount = 3;
        *       sayHello(someName, someAmount);
        * parameters must be in order, for example:
        *       sayHello(2, "Sarah");
        * will throw an error because the first formal parameter is
        * type String, and the actual first parameter used was an int.
        */
        for(int i = 0; i < times; i++)
        {
            System.out.println("Hello, " + name + "!");
        }
    }
}
