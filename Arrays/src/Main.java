import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Arrays in Java!");

        /* Arrays: It is a data structure that stores data of the same type in a sequential manner. An array takes a
                    contiguous section of the memory.
         */

        // Given the marks of students in a classroom, calculate the average marks. Assume class size to be 10.
        int[] marks = new int[10];
        marks[0] = 67;
        System.out.println(marks[0]);

        System.out.println(marks); // It will only print the memory address.

        int[] marks2 = {50, 55, 60, 65, 70, 75, 80, 85, 90, 95};
        System.out.println(marks2[3]);

        String[] names = new String[2];
        names[0] = "Rishi";
        names[1] = "Kesh";
        System.out.println(names.length);

        // Taking input in an array
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Showing the ouput of an array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}