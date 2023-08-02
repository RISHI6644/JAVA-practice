package Collections;

import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        System.out.println("Let's learn about the vector class");

        /* Vector class: A vector can be defined as a dynamic array that can grow
            or shrink on its own. For instance, vector will grow when more elements
            are added to it and will shrink when elements are removed from it.
            Similar to arrays, vector elements can be accessed using integer indices.

            It is similar to ArrayList, but with two differences −
            i) Vector is synchronized. Means all the methods in Vector are marked
              ‘synchronized’ and thus once a method is invoked, the same method
              cannot be invoked unless the previous call has ended. In other words,
              only one thread can access it at a time unlike arraylist where multiple
              threads can access it.
            ii) The vector class has many methods that are not a part of the
                collections framework but its legacy methods.

            A Vector class is a part of the “java.util” package and implements
            List interface. A Vector is an array of objects or vector of objects.

            ArrayList is much faster than vector.
         */

        List<Integer> vector = new Vector<>();
        vector.add(18);
        vector.add(30);
        vector.add(10);
        vector.add(74);

        System.out.println(vector);
        System.out.println(vector.size());
    }
}
