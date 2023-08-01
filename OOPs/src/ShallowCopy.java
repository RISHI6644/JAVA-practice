public class ShallowCopy {
    public static void main(String[] args) {
        System.out.println("Let's learn about shallow copy!!!");

        /* Shallow Copy: When we need to copy some entities from one object to another
            so that changes in one entity are reflected in the other entities as well,
            then we can perform a shallow copy. The default version of clone() method
            creates the shallow copy of an object. The shallow copy of an object will
            have exact copy of all the fields of original object. If original object
            has any references to other objects as fields, then only references of those
            objects are copied into clone object, copy of those objects are not created.
            That means any changes made to those objects through clone object will be
            reflected in original object as well.

            In shallow copy, new memory allocation never happens for the other entities,
            and the only reference is copied to the other entities.
         */

        ShallowCopyExample obj1 = new ShallowCopyExample();
        System.out.println(obj1.x);

        ShallowCopyExample obj2 = obj1; // it will copy the reference, not value
        System.out.println(obj2.x);

        obj2.x = 30; // we are updating the value of x using the reference variable obj2
        System.out.println(obj1.x); // displaying the value of x using the reference variable obj1
    }

    public static class ShallowCopyExample {
        int x = 25;
    }
}
