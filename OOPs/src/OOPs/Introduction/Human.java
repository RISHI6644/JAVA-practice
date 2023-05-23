package OOPs.Introduction;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    /* static: It denotes such properties that are not directly related to the objects,but are common to all the objects
                of the class. static variables are not depended on objects.
                To access the class variable, we should use the class name.
     */

    static long population;

    static void message() {
        System.out.println("Hello!!!");
        // System.out.println(this.age); // We cannot use this keyword here since it is referring to the non-static
                                        // element
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

        Human.message();
    }
}

class HumanMain {
    public static void main(String[] args) {
        Human rishi = new Human(24,"Rishikesdh Das", 15000, false);
        Human rahul = new Human(29, "Rahul Dutt", 30000, false);

        System.out.println(rishi.salary);
        System.out.println(Human.population);
        System.out.println(Human.population);

        // greeting(); // static method can only access static data. It cannot access non-static data
    }

    // Something which is not static, belongs to an object.
    void greeting() { // This is dependent on objects. An object is needed to access this method.
        System.out.println("Greetings!");
        func(); // but we can call a static method inside a non-static method.
    }

    static void func() { // This is not dependent on objects
        // greeting(); // We cannot use this as it requires an instance but the method we are using it in doest not
                        // require an instance.
        System.out.println("This is a static method");

        // To access the non-static method we can follow this approach:
        HumanMain obj = new HumanMain();
        obj.greeting(); // By referencing the instance
    }

    void func2() {
        greeting(); // It can be used since both are non-static method
    }
}
