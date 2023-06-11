package EncapsulationAbstraction;

import AccessModifiers.A;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Encapsulation & Abstraction in Java!!");

        /* Encapsulation: It means wrapping up the implementation of the data members and the methods inside a class.
                        It basically hides all the data and codes into a single entity so that it can be protected from
                        the outside world.
         */

        /* Abstraction: It means hiding the unnecessary details but only showing essential information. Achieved via
            'Abstract' classes and interfaces.
        */
        // Abstract Data Types: They can be accessed or modified using some methods(i.e. get(), set(), add() etc.)

        /* Encapsulation(Implementation level) vs Abstraction(design level)
               Abstraction solves design related issues whereas encapsulation solves implementation related issues.
               In other words, abstraction focuses on the external stuffs whereas encapsulation focuses on the internal
               workings

               Abstraction is a process of gaining information whereas encapsulation is a process of containing
               information
         */

        /* Data Hiding: It is focused on data security unlike encapsulation which focuses on hiding the complexity of
            the system. we use 'private' keyword to hide data.
            Encapsulation is a sub-process in data hiding.
         */
    }
}
