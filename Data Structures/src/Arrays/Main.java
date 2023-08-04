package Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Arrays & how they works!!!");

        // Task: Store a roll number
        int my_roll = 25;

        // Task: Store a person's name
        String my_name = "RISHIKESH DAS";

        // Task: Store five roll numbers
        int roll1 = 26;
        int roll2 = 27;
        // ... ... ... ; So, this is time consuming to store more data

        /* Array: It is a data structure that stores data of the same type in a sequential manner. An array takes a
                    contiguous section of the memory.
           Syntax : dataType[] var = new dataType[size];
           Here, dataType[] basically means 'var' reference variable is pointing to an array object that contains
           'dataType' types of elements. And 'new' keyword basically used to create an object.

           How does array works ?
           => dataType[] var; This is called declaration (happens at compile time) of array means 'var' is getting
               defined in the stack.
              var =  new dataType[size]; This is called initialization (happens at run time). Here the object is being
               created in the memory(heap) means memory has been allocated. This process is known as
               'Dynamic memory allocation'.

            Representation of Array: Arrays can be represented by blocks of memory. And in many languages,
             i.e. C, C++ these memory blocks are stored continuously (Continuous memory allocation).
             Means, each memory cells will have an address and each element of an array will be appended serially.

            But in Java,  there is concept of pointers means you cannot get the address or anything. So, it totally
             depends on the JVM whether this is going to be continuous or not.
             We know that:
             i) Array objects are stored in heap
            ii) According to JLS (Java Language Specification), heap objects are not continuous
            iii) Heap is the runtime data area from which the memory for all the classes and instances
                 of all the array is allocated (Dynamic memory allocations)
            Hence, internally, array objects in java may not be continuous since it depends on
             JVM (heap, stack are part of it).

             Index of an array: Index is a number that basically defines the position for an element of an array.
                Indices starts from 0 and continues sequentially.
         */

        int[] roll_nos = new int[5]; // [0 0 0 0 0]
        // or, you can directly write like this
        int[] roll_nos2 = {25, 26, 27, 28, 29, 30}; // All the type of the data should be same

        System.out.println(roll_nos[0]); // For int[] arrays by default it will have only 0 as elements
        System.out.println(roll_nos2[0]);

        String[] names = new String[2];
        System.out.println(names[0]); // For String[] arrays by default it will have only 'null' as elements

        /* null: It is not a keyword rather it is a special literal which can be assigned or cast to any
            particular reference type. But it cannot be assigned to primitive references i.e. int, char etc.
         */
        String str = null;
        // int x = null; It will show an error
    }
}
