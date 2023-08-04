package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // We can use enhanced for loop to print the elements
        for (int element:arr) { // Here, element represents element of the array. So, for every element in array,
                                // print the element
            System.out.print(element + " ");
        }
        System.out.println();

        // There is also an easy approach to print the elements of an array
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {7, 62, 51};
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    // Passing an array as parameter in a method
    static void change(int[] arr) {
        arr[0] = 69;
    }
}
