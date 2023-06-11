package AccessModifiers;

public class Amain {
    public static void main(String[] args) {
        A obj = new A(18301074, "Rishikesh", new int[10], 5);
        SubClass obj2 = new SubClass(18301223, "Random", new int[12], 10);
        System.out.println(obj2.num); // Accessing the protected property via the subclass in same package
    }
}
