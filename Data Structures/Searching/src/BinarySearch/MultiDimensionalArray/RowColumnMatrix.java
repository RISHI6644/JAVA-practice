package BinarySearch.MultiDimensionalArray;

/* Question: Consider the following matrix sorted in Row-wise & Column-wise order
    mat A = [[10, 20, 30, 40],
            [15, 25, 35, 45],
            [28, 29, 37, 49],
            [33, 34, 38, 50]]
    Now, a target is given which is 37. Write the code to find the element and return
    its index.
 */

/*
    Case 1: If (current element == target) => return current element's index

    Case 2: If (current element < target) => row++

    Case 3: If (current element > target) => col--
 */

import java.util.Arrays;

public class RowColumnMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {28, 29, 37, 49},
                          {33, 34, 38, 50}};
        int target = 37;

        System.out.println(Arrays.toString(searchTarget(matrix, target)));
    }

    public static int[] searchTarget(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return new int[] {row, column};
            } else if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[] {-1, -1};
    }
}
