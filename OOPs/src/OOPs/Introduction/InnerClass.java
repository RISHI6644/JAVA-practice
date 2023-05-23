package OOPs.Introduction;

// Outside classes cannot be static since it is not dependent on any other class. Only inner classes can be static.
public class InnerClass {
    // When a class is declared as static, then it will not be dependent on the objects of its upper-class
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Rishi");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//static class A {
//
//}