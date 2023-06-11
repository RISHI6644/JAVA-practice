package EncapsulationAbstraction;

import AccessModifiers.A;

public class SubClass extends A {
    public SubClass(int id, String name, int[] arr, int num) {
        super(id, name, arr, num);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(113880, "Any name", new int[15], 25);
        System.out.println(obj.num);

        A obj2 = new A(1223, "Class", new int[5], 30);
        // System.out.println(A.num);
        // We cannot access the protected properties via class since it does not know about the sub-class's properties.
    }
}

class SubSubClass extends SubClass {

    public SubSubClass(int id, String name, int[] arr, int num) {
        super(id, name, arr, num);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(2441139, "Bela Bose", new int[9], 96);
        System.out.println(obj.num);
    }
}

class SubClass2 extends A {

    public SubClass2(int id, String name, int[] arr, int num) {
        super(id, name, arr, num);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(563213, "Protected", new int[10], 45);
        System.out.println(obj.num);

        // In different packages, protected properties can only be accessed via the sub-classes.
    }
}
