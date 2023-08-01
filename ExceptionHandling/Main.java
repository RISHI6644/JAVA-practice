package ExceptionHandling;

import java.io.LineNumberReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about exception handling!!!");

        // What's the difference between error and exception ?
        /* Error is basically caused by the lack of resources
            i.e. stack overflow. Error is not recoverable or can be handled.

            Exception is an event that disrupts the normal flow of the program.
             It is an object which is thrown at runtime. i.e. dividing something
             by 0(arithmetic exception)
             In Java, there is a class called "throwable" which is responsible for
              handling the exceptions.

              Exceptions are of two types:
              i) checked: These are the exceptions checked during the compile-time.
                  for instance, you want to open a file but the file location provided
                  on the code is wrong. Then there will occur an exception.

              ii) Unchecked: These are the exceptions checked during the run-time.
                   for instance, arithmetic exceptions.
         */

        int a = 5;
        int b = 0;
        // int c = a / b; // throws an exception

        try {
            // int c = a / b;
            // divide(a, b);
            String name = "Rishi";
            if (name.equals("Rishi")) {
                throw new CustomException("Name is Rishi");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { // It does not depend on exception throwing and it can be used only once
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{ // throws basically used to just declare an exception
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero"); // throw basically means that we are throwing
                                                                           // an exception
        }
        return a / b;
    }
}
