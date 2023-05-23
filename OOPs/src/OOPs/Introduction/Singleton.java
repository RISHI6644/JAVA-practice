package OOPs.Introduction;

/* Singleton classes: These classes can only create one instance. So, create only one object the should not be allowed
            to call the constructor of that class. Because whenever the constructor is called new object will be created.
 */

public class Singleton {
    private int num = 0; // Only visible to Singleton class.
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // Check whether an object is already created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonMain {
    public static void main(String[] args) {
        // Singleton obj = new Singleton(); // We cannot call it.
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance(); // It will actually refer the same instance(obj).
    }
}