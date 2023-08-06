package ArrayList;

import java.util.Arrays;

public class SwappingElements {
    public static void main(String[] args) {
        int[] arr = {18, 30, 10, 74};
        swapElements(arr, 0, 3);

        System.out.println(Arrays.toString(arr));
    }

    static void swapElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
