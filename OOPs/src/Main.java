public class Main {
    public static void main(String[] args) {
        System.out.println("Finally!! Let's dive into Object-Oriented Programming");

        // creating the car class's object
        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println(c1.model);
        System.out.println(c2.price);

        c2.color = "White";
        c2.price = 5000000;

        System.out.println(c2.color);
        System.out.println(c2.price);

        c1.drive();
        c1.lock();
        c1.unlock();
        c2.lock();

        System.out.println(c1.isLocked);
        System.out.println(c1.isLocked);
        System.out.println(c2.isLocked);

        System.out.println(c1.getPrice());
        c2.setPrice(5000000);
        System.out.println(c2.getPrice());
        c1.setPrice(-4000000);
        System.out.println(c1.getPrice());
    }
}
/* OOP: Object-Oriented Programming is a programming style that deals with classes & objects.
        The goal of OOP is to implement real world entities such as object, classes, abstraction,
        inheritance, polymorphism etc.
 */

/* What is a class ?
  => A class is a blueprint for the object.
     It is the logical construct of an object.

  What is an object ?
  => An object is an entity that has a state and some behaviour.
     It is the physical reality of classes. Also, it occupies space
     in memory.
     An object has:
     -> properties(Variables) / Identity
     -> state(value)
     -> method(functionalities) / Behaviour
 */

class Car {
    String model = "Civic";
    String color = "Black";
    int price = 4000000;
    boolean isLocked = false;

    void drive() {
        System.out.println("The car is in now drive mode");
    }

    void lock() {
        isLocked = true;
        System.out.println("The car is now locked");
    }

    void unlock() {
        isLocked = false;
        System.out.println("The car is unlocked now");
    }

    // Getter method for price property
    float getPrice() {
            return price;
        }

    // Setter method for price property
    void setPrice(int priceValue) {
        if (priceValue < 0) {
            priceValue = 0;
        }
        price = priceValue;
    }
}