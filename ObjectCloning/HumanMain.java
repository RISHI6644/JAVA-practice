package ObjectCloning;

public class HumanMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rishi = new Human(25, "RISHIKESH DAS");
        // Human twin = new Human(rishi); // making a copy of rishi

        Human twin = (Human)rishi.clone(); // The clone() method saves the extra processing time for creating the
                                           // exact copy of an object. If we perform it by using the new keyword,
                                           // it will take a lot of processing time to be performed that is why
                                           // we use object cloning.
        System.out.println(twin.age + " " + twin.name);
    }
}
