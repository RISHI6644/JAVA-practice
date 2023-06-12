package Packages;

public class ObjectDemo {
    /* In java, Object class is the parent class of all the classes by default.
        It is the topmost class in an inheritance hierarchy. It can be used to refer an object whose type is unknown.
        It has some overridden methods that we will learn shortly.
     */

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override // We can override it to use it as we want
    public int hashCode() {
        /* The hashCode() method is used to compute the hash values of given input objects. It returns an integer whose
            value represents the hash value of the input object.
         */
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        /* The equals() method is used to compare two strings based on the content of the string.
            It needs to be overridden if we want to check the objects based on some property.
         */
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        /* The toString() method is used to return a String representation of an object. If any object is printed, this
            method is internally invoked by the java compiler. Otherwise, the user implemented or overridden method will
            be called.
         */
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        /* The finalize() method is used during garbage collection to release all the resources used by the object
            before it is deleted/destroyed by the Garbage collector. Once the clean-up activity is done by the
            finalize() method, garbage collector immediately destroys the Java object.
         */
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(74, 3.65f);
        System.out.println(obj.hashCode());

        ObjectDemo obj2 = new ObjectDemo(74, 3.78f);
        System.out.println(obj2.hashCode());

        ObjectDemo obj3 = obj2;
        System.out.println(obj3.hashCode()); // Now the hash values will be same

        if (obj == obj2) { // This is actually checking whether these variables are pointing to the same variable or not
            System.out.println("Obj is equal to Obj2");
        }

        if (obj.equals(obj2)) { // This is actually checking the content of num from the objects
            System.out.println("Obj is equal to Obj2");
        }

        // instanceOf operator is used to check whether an object is an instance of a particular class or not
        System.out.println(obj instanceof ObjectDemo); // true
        System.out.println(obj instanceof Object); // true

        // getClass() method returns the runtime class of an object
        System.out.println(obj.getClass());

        // getName() method is used to get the name of the entity which can be class,interface, array, method etc.
        System.out.println(obj.getClass().getName());
    }
}
