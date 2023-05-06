public class Cnstrctor {
    /* Constructor is a special method which is called when an object is instantiated.
        It has the same name as the class itself and is invoked automatically at the time of
        object construction. Constructors doesn't have any return types.
     */
    String class_name;
    String module_name;
    int module_no;

    // Writing the default constructor
    Cnstrctor () {
        System.out.println("Inside the default constructor");
        class_name = "Cnstructor";
        module_name = "OOP";
        module_no = 12;
    }

    // Writing the parameterized constructor
    Cnstrctor(String clsName, String mdlName) {
        System.out.println("Inside the parameterized constructor");
        class_name = clsName;
        module_name = mdlName;
    }

    Cnstrctor (String clsName, String mdlName, int mdlNo) {
        class_name = clsName;
        module_name = mdlName;
        setMdlNo(mdlNo);
    }

    void setMdlNo(int mdlNo) {
        if (mdlNo < 0) {
            module_no = 0;
        }
        module_no = mdlNo;
    }
}

class CnstrctorMain {
    public static void main(String[]args) {
        Cnstrctor obj1 = new Cnstrctor();
        System.out.println(obj1.class_name);
        System.out.println(obj1.module_name);
        System.out.println(obj1.module_no);

        Cnstrctor obj2 = new Cnstrctor("Constructor", "OOPs");
        System.out.println(obj2.class_name);
        System.out.println(obj2.module_name);
        System.out.println(obj2.module_no);

        Cnstrctor obj3 = new Cnstrctor("Constructor", "OOPs", 13);
        System.out.println(obj3.class_name);
        System.out.println(obj3.module_name);
        System.out.println(obj3.module_no);
    }
}
