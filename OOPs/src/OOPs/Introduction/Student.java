/* packages: These are known as the container/boxes for classes. They are used to keep the class name in compartments.
              In simple words, packages are just like folders. Packages are stored as hierarchy in manner.
 */

package OOPs.Introduction;

/* import statement: when import keyword is used, all the packages/classes/interfaces becomes visible to a program
    under a package.
    Syntax: package1.package2.myclass

    Here, package1 is in top level and package2 is in subordinate level and here only myclass from package2 wil be
    imported.
 */

import java.util.Arrays;

public class Student {
    // Instance variables declaration
    int rno;
    String name;
    float marks;

    /* We need a way to add the values of the above properties
        object by object means we need one word to access every
        object.
        And the word is 'this' keyword. It is used to replace the
        reference variable in constructor.
        this keyword also helps to call a constructor from another constructor.
     */

    Student() {
        this.rno = 01;
        this.name = "Name";
        this.marks = 90.0f;

        // To call a constructor from another constructor
        // Internally: new Student(13, "Default person", 95.0f);
        // this(13, "Default person", 95.0f);
    }

    // Constructor Overloading
    // Student Aaron = new Student(32, "Aaron Paul", 69.5);
    // Here, this will be replaced with Aaron
    Student(int rno, String name, float marks) { // int roll, String naam, float numbers
        this.rno = rno; // rno = roll;
        this.name = name; // name = naam;
        this.marks = marks; // narks = numbers;
    }

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting() {
        System.out.println("Hello, My name is " + this.name);
    }
}

class StudentMain {

    /* Why main method is declared as static ?
        Firstly, think about static. static used to make the property/function visible without crating an object of that
        class.
        main function is the very first thing that runs when we run a java program. It is responsible to run a program.
        So, main is mandatory. Since it is the first function to run a program and the program needs to access its
        elements without creating any objects. That is why main function is declared as static.
     */

    public static void main(String[] args) {
        // Store 5 roll numbers
        int[] roll_numbers = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // Data of 5 students
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));

        Student rishi; // Reference Variable(Stored in stack memory) declaration
        // System.out.println(rishi.rno);
        // To create objects, we have to use 'new' keyword

        /* new keyword: It dynamically allocates memory at runtime
            and returns a reference variable to it.
         */

        /* Dynamic Memory Allocation: consider the following line:
            Student s1 = new Student(); here everything in left hand
            side happens at compile time(When the program check for
            errors and convert it to bytecode) and right hand side is
             happens at the run time(When the program will be running).
             That is when the allocation of dynamic memory takes place.
         */
        rishi = new Student();
        // Student rishi = new Student();
        rishi.rno = 25;
        rishi.name = "Rishikesh Das";
        rishi.marks = 87.5F;

        // rishi.salary = 75000; // It can be done on python
        
        System.out.println(rishi);
        System.out.println(rishi.rno);
        System.out.println(rishi.name);

        rishi.greeting();

        Student rahul = new Student(30, "KL Rahul", 85.8f);

        System.out.println(rahul.rno);
        System.out.println(rahul.marks);

        rahul.greeting();

        Student random = new Student(rishi);

        System.out.println(random.rno);
        System.out.println(random.marks);

        Student one = new Student();
        Student two = one;
        one.name = "Random Name";

        System.out.println(two.name); // Both reference variables are referring to the same object.

        /* final keyword used to prevent content from modifying.
            final int increase = 2; // Always initialize while declaring.

            final Student rishi = new Student("Rishikesh Das");
            rishi.name = "New name"; // So, we can modify in case of objects

            But we cannot do the following:
            rishi = new Student("new object"); // When a non-primitive is final, we cannot reassign it
         */

        final int bonus = 2;
        // bonus = 3; // It can't be done
        
    }
}