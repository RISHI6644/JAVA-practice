package ObjectCloning;

public class Human implements Cloneable{ // Since we will clone Human class's object, so we are implementing
                                         // the Cloneable interface
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // This is shallow copy
        return super.clone();
    }
}
