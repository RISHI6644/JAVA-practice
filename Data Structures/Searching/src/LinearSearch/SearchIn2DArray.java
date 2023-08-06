package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {28, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12} // If we set target any of these, previous index of same element will be returned
        };

        int target = 34;
        int[] result = search(arr, target); // format of return value {row, col}
        System.out.println(Arrays.toString(result));

        int maximum = maxValue(arr);
        System.out.println(maximum);

        int minimum = minValue(arr);
        System.out.println(minimum);
    }

    // Searching a target element from a multidimensional array
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // Searching the maximum value from a multidimensional array
    static int maxValue(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    // Searching the minimum value from a multidimensional array
    static int minValue(int[][] arr) {
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
