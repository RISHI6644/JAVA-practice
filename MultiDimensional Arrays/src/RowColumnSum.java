import java.util.Arrays;

public class RowColumnSum {
    public static int[] solve(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[] result = new int[row + col];

        //  Performing row sums
        for (int i = 0; i < row; i++) {
            int row_sum = 0;
            for (int j = 0; j < col; j++) {
                row_sum += A[i][j];
            }
            result[i] = row_sum;
        }

        // Performing col sum
        for (int j = 0; j < col; j++) {
            int col_sum = 0;
            for (int i = 0; i < row; i++) {
                col_sum += A[i][j];
            }
            result[row + j] = col_sum;
        }

        return result;
    }

    public static void main(String[]args) {
        int[][] A = {{1, 2}, {4, 5}, {8, 9}};
        int[] result = solve(A);
        System.out.println(Arrays.toString(result));
    }
}
