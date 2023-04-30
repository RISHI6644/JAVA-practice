import java.util.Scanner;
public class SumOfMatrices {
    // static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] mat_A = new int[row][col];
        int[][] mat_B = new int[row][col];
        int[][] result = new int[row][col];

        for (int i = 0; i < mat_A.length; i++) {
            for (int j = 0; j < mat_A[i].length; j++) {
                mat_A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat_B.length; i++) {
            for (int j = 0; j < mat_B[i].length; j++) {
                mat_B[i][j] = sc.nextInt();
            }
        }

        // Reading the matrices by using the method
        //  readMatrix(mat_A);
        //  readMatrix(mat_B);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = mat_A[i][j] + mat_B[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method for reading matrices
//    static void readMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//    }
}
