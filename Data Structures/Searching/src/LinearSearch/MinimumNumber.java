package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {18, 30, 10, 74};

        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
