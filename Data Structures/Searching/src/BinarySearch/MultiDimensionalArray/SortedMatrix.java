package BinarySearch.MultiDimensionalArray;

public class SortedMatrix {
    public static void main(String[] args) {
        
    }

    // Search in the particular row that is provided between the columns
    public static int[] binarySearch(int[][] matrix, int row, int column_start, int column_end, int target) {
        while (column_start <= column_end) {
            int middle = (column_start + column_end) / 2;
            
            if (matrix[row][middle] == target) {
                return new int[] {row, middle};
            }
            else if (target < matrix[row][middle]) {
                column_end = middle - 1;
            }
            else {
                column_start = middle + 1;
            }
        }
        return new int[] {-1, -1};
    }

    public static int[] searchElement(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
    }
}
