package Inheritance;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.length + " " + box.height + " " + box.width);

        Box box1 = new Box(3.0);
        System.out.println(box1.length + " " + box1.height + " " + box1.width);

        Box box2 = new Box(9.5, 5.10, 3.50);
        System.out.println(box2.length + " " + box2.height + " " + box2.width);

        Box box3 = new Box(box2);
        System.out.println(box3.length + " " + box3.height + " " + box3.width);

        BoxWeight box4 = new BoxWeight();
        System.out.println(box4.length + " " + box4.weight);

        Box b1 = new BoxWeight(2, 4, 6, 8); // Here b1 is a reference type of Box(Parent) class which is
                                                         // referring to an object of BoxWeight(child) class. So, a
                                                         // parent is referring its child
        System.out.println(b1.length);
     // System.out.println(b1.weight); // Box class doesn't recognize weight property as it is initialized in its child
                                       // class. child class can recognize the properties from its parent class, but
                                       // parent class cannot do the same.

     // BoxWeight b2 = new Box(5, 7, 9); // We cannot refer a child to its parent

        /* There are many variables in both parent and child classes.
            We are given access to variables that are in the reference type i.e. BoxWeight.
            Hence, we should have access to weight variable means once we are trying to access it should be initialized.
            But here, when the object itself is of type parent class, how can it call the constructor of child class.
         */

        BoxWeight old = new BoxWeight(box4);
        System.out.println(old.weight);

        BoxPrice box5 = new BoxPrice(5, 8, 200);
        System.out.println(box5.cost);

        BoxColor box6 = new BoxColor(5, 5.10, 2.5, 78, 4);
        System.out.println(box6.clr);
    }
}
