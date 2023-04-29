public class MethodOverloading {
    static int add (int a, int b) {
        System.out.println("Inside the first add method");
        return a + b;
    }
    static String add(String s1, String s2) {
        System.out.println("Inside the second add method");
        return s1+ s2;
    }

    static String add (String s, int i) {
        System.out.println("Inside the third add method");
        return  s + i;
    }

    public static void main(String[]args) {
        System.out.println(add(5, 5));
        System.out.println(add("Hello", " Everyone"));
        System.out.println(add(":", 3));
    }
}
