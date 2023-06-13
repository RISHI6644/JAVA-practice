package EncapsulationAbstraction.AbstractDemo;

public class ParentMain {
    public static void main(String[] args) {
        // Parent p1 = new Parent(); // We cannot create object of an Abstract class
        Parent child = new Son(); // But we can use Parent as reference variable
        child.partner("Hazel", 19);
        Parent.greeting();

        Son son = new Son();
        son.career("Engineer");
        son.normal();

        Daughter daughter = new Daughter();
        daughter.career("Doctor");
    }
}
