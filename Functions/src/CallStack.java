// Call Stack => It is a stack data structure that is used by a program to keep track of method calls
// It used stack frames to keep track of methods
public class CallStack {
    public static void main(String[]args) {
        int x = 0;
        System.out.println("Inside the main method");
        first();
    }

    static void first() {
        int x = 10;
        System.out.println("Inside the first method");
        second();
    }

    static void second() {
        int x = 20;
        System.out.println("Inside the second method");
        third();
    }

    static void third() {
        int x = 30;
        System.out.println("Inside the third method");
        System.out.println(x);
    }
}
