package BinarySearch.MultiDimensionalArray;

/* Question: Consider the following matrix which is strictly sorted (First element of a
                particular row is greater than the last element of the previous row)
    mat A = [[1, 2, 3, 4],
            [5, 6, 7, 8],
            [9, 10, 11, 12],
            [13, 14, 15, 16]]
    Now, a target is given which is 11. Write the code to find the element and return
    its index.
 */

/*  Take the middle column/row and perform binary search on it (reducing the search space)

    Case 1: If (middle element == target) => return middle

    Case 2: If (middle element > target) => ignore rows after it

    Case 3: If (middle element < target) => ignore rows above it

    In the end, only two rows (two elements) will be remaining
        -> Check whether the middle column contains the target element
        -> consider the four parts
 */

import java.util.Arrays;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        System.out.println(Arrays.toString(searchElement(arr, 16)));
    }

    // Search in the particular row that is provided between the columns
    public static int[] binarySearch(int[][] matrix, int row, int column_start, int column_end, int target) {
        while (column_start <= column_end) {
            int middle = (column_start + column_end) / 2;
            
            if (matrix[row][middle] == target) {
                return new int[] {row, middle};
            }
            else if (matrix[row][middle] < target) {
                column_start = middle + 1;
            }
            else {
                column_end = middle - 1;
            }
        }
        return new int[] {-1, -1};
    }

    public static int[] searchElement(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Be cautious, matrix may be empty

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int row_start = 0;
        int row_end = rows - 1;
        int mid_column = cols / 2;

        // Run the loop till two rows are remaining
        while (row_start < (row_end - 1)) { // while this is true, it will have more than two rows
            int middle = (row_start + row_end) / 2;

            if (matrix[middle][mid_column] == target) {
                return new int[] {middle, mid_column};
            }
            else if (matrix[middle][mid_column] < target) {
                row_start = middle;
            }
            else {
                row_end = middle;
            }
        }

        // Now we have only two rows
        // Check whether the target is in the middle column of these two rows
        if (matrix[row_start][mid_column] == target) {
            return new int[] {row_start, mid_column};
        }
        else if (matrix[row_start + 1][mid_column] == target) {
            return new int[] {row_start + 1, mid_column};
        }

        // Otherwise, check in 1st, 2nd, 3rd and 4th half
        else if (target <= matrix[row_start][mid_column - 1]) {
            return binarySearch(matrix, row_start, 0, mid_column - 1, target);
        }
        else if (target >= matrix[row_start][mid_column + 1] && target <= matrix[row_start][cols - 1]) {
            return binarySearch(matrix, row_start, mid_column + 1, cols - 1, target);
        }
        else if (target <= matrix[row_start + 1][mid_column - 1]) {
            return binarySearch(matrix, row_start + 1, 0, mid_column - 1, target);
        }
        else {
            return binarySearch(matrix, row_start + 1, mid_column + 1, cols - 1, target);
        }
    }
}
