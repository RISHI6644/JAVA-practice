package ArrayList;

import java.util.Arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {18, 30, 10, 74};

        System.out.println(maxValue(arr));
        System.out.println(maxValueRange(arr, 0, 2));
    }

    static int maxValue(int[] arr) {
        // Let's work on the edge cases here
        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // If we want to find a maximum value in a range then we can do the following
    static int maxValueRange(int[] arr, int start, int end) {
        // Let's work on the edge cases here
        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
