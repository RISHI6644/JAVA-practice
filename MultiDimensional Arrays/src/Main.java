import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Let's leatn about 2D Arrays!!!!!!");

        // Initializing 2D Arrays
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][0]);

        // Iterating over 2D Arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Creating dynamic 2D Arrays
        int rows = 3;
        int cols = 4;
        int[][] arr1 = new int[rows][cols];

        arr1[1][2] = 20;
        System.out.println(arr1[1][2]);
        System.out.println(arr1[2][3]);

        // Read input for 2D Arrays
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr2 = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
