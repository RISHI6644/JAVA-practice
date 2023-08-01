public class DeepCopy {
    public static void main(String[] args) {
        System.out.println("Let's learn about Deep copy!!!");

        /* Deep Copy: When we need to copy some entities from one object to another
            so that changes in one entity are not reflected in the other entities,
            then we can perform a deep copy. The deep copy of an object will have exact
            copy of all the fields of original object just like shallow copy. But in addition,
            if original object has any references to other objects as fields, then copy of those
            objects are also created by calling clone() method on them. That means clone object and
            original object will be 100% disjoint. They will be 100% independent of each other.
            Any changes made to clone object will not be reflected in original object

            In deep copy, a new memory allocation happens for the other entities, and reference
            is not copied to the other entities. Each entity has its own independent reference.
         */

        DeepCopyExample obj1 = new DeepCopyExample();
        System.out.println(obj1.x);

        DeepCopyExample obj2 = new DeepCopyExample(); // it will copy the reference, not value
        System.out.println(obj2.x);

        obj2.x = 30;
        System.out.println(obj1.x); //  obj1 and obj2 are referring to different memory locations
        System.out.println(obj2.x);
    }

    public static class DeepCopyExample {
        int x = 25;
    }
}
