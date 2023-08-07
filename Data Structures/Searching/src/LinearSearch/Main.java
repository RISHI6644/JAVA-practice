package LinearSearch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Linear search!!!");

        /* Linear Search: Linear search is used to search a key element from multiple elements.
            It is less used today because it is slower than binary search and hashing.

            Algorithm:
                Step 1: Traverse the array
                Step 2: Match the key element with array element
                Step 3: If key element is found, return the index position of the array element
                Step 4: If key element is not found, return -1
         */

        int[] arr = {18, 30, 10, 74};
        int target = 30;

        int result = linearSearch(arr, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            // Check for element at every index for matching the target
            if (arr[i] == target) {
                return i;
            }
        }
        // This line will be executed if none of the above return statements have executed
        // In other words, when the target does not found
        return -1;
    }
}
