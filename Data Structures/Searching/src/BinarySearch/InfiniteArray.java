package BinarySearch;

// Question: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Imagine that the array you are given on the function as parameter is an infinite array
// By imagine, it means that we cannot use the length function or in other words we cannot
// calculate the length of the array (arr.length cannot be used)
// Define start and end since the array is infinite
// To search the element, we can move in chunks through the array
/*
    In terms of binary search, the array actually shrinks about half means after each
    search, the length becomes N/2. So, the length becomes 1 at the end of the search.
    And to move chunks by chunks in an infinite array we can do the reverse process means
    we can double the chunk size after each search so that can cover a higher range. And it
    will also take log(N) amount of time.
 */

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 9, 10, 12, 15, 18, 25, 27, 30, 38, 44};
        int target = 15;

        System.out.println(searchInRange(arr, target));
    }

    static int searchInRange(int[] arr, int target) {
        // Firstly, find the range and to do that start with a box of size 2
        int start = 0;
        int end = 1;

        // Condition to check whether the target lies in the range
        while (target > arr[end]) {
            // Double the box size
            int new_start = end + 1;
            // end = previous end + size of the box * 2
            end = end + (end - start + 1) * 2; // Size of the box = end - (start - 1) => end - start + 1
            start = new_start;
        }
        return elementSearch(arr, target, start, end);
    }

    public static int elementSearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int middle = (start + end) / 2;

            if (arr[middle] == target) {
                return middle;
            }
            else if (target < arr[middle]) {
                end = middle - 1;
            }
            else if (target > arr[middle]) {
                start = middle + 1;
            }
        }
        return -1;
    }
}
