package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about ArrayList!!!");

        /* ArrayList: The ArrayList class is a resizable array. It is basically part of the
            collection framework which can be found in the java.util package.
            It is similar to vectors in C++.

            Why we need an ArrayList ?
            => We know arrays are of fix size. We basically use arrays when the amount of data
                to be stored or size is known. But what if the size is unknown, let's say we
                want to store any number of elements. If this is the case, then we use the
                'ArrayList' data structure where elements can be added and removed from it
                 whenever we want.

            Syntax: ArrayList<dataType> var = new ArrayList<dataType>();

            ex: Arraylist<String> list = new ArrayList<>();
            Elements in an ArrayList are actually objects. In the example above, we created
            elements (objects) of type "String". Remember that a String in Java is an object
            (not a primitive type). To use other types specifically primitive ones such as
            int, you must specify an equivalent wrapper class: Integer. For other primitive
            types, use: Boolean for boolean, Character for char, Double for double, etc.

            Internal working of ArrayList:
            i) size is fixed initially
            ii) When the ArrayList gets filled up by the elements:
                -> It creates a new ArrayList by making the size double
                -> Old elements are copied to the new one
                -> Old one is deleted
         */

        ArrayList<Integer> list = new ArrayList<>(); // Here Integer is the wrapper class of the primitive data type int
        list.add(69);
        list.get(0);
        System.out.println(list);

        System.out.println(list.contains(69)); // true
        list.set(0, 39);
        System.out.println(list);

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }

        // get item from any index
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i)); // pass index here; list2[i] will not work here
        }

        // Printing the ArrayList
        System.out.println(list2);

        // Print using for-each loop
        for (int n:list2) {
            System.out.println(n);
        }
    }
}
