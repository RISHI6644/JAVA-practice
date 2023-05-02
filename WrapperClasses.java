// Wrapper classes provides the facility to use primitive data types as objects
/* Why do we need these wrapper classes ?
    => Collections: The java collections such as ArrayList requires objects instead of primitive types
    => Synchronization: Java synchronization works with objects in Multithreading
 */

import java.util.ArrayList;
public class WrapperClasses {
    public static void main(String[] args) {
        System.out.println("Let's learn about the wrapper class, Autoboxing as well Unboxing in Java");
        // ArrayList<int> arr = new ArrayList<int>(); // invalid
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int x = 5;
        Integer y = 5;

// Autoboxing is the automatic conversion made by the Java compiler between the primitive types and their corresponding object wrapper classes
        int a = 5;
        float b = 3.32F;
        long c = 10000;

        Integer intObj = a;
        Float floatOnj = b;
        Long longObj = c;

        System.out.println(intObj);
        System.out.println(floatOnj);
        System.out.println(longObj);

        System.out.println(intObj.intValue());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(10,7));

        Integer num = 5;

// Unboxing is the automatic conversion of a wrapper object to its corresponding primitive data type
    Integer p = 6;
    Double q = 3.32;
    Character r =  'R';

    int i = p;
    double j = q;
    char k = r;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
