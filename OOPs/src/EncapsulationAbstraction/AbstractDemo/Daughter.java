package EncapsulationAbstraction.AbstractDemo;

public class Daughter extends Parent{
    @Override
    void career(String name) {
        System.out.println("I want to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I Love " + name + "and he's " + age + " years old");
    }

    @Override
    void normal() {
        System.out.println("This normal method is in Daughter class");
    }
}
