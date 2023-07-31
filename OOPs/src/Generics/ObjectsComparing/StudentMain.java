package Generics.ObjectsComparing;

public class StudentMain {
    public static void main(String[] args) {
        Student rishi = new Student(25, 86.5f);
        Student pinto = new Student(18, 87.9f);

        if (rishi.compareTo(pinto) < 0) {
            System.out.println(rishi.compareTo(pinto));
            System.out.println("Pinto has more marks than Rishi");
        }
    }
}
