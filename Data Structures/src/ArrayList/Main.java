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
        for (int i = 0; i < 5; i++) {
            System.out.println(list2.get(i)); // pass index here; list2[i] will not work here
        }

        // Printing the ArrayList
        System.out.println(list2);
    }
}
