package BinarySearch;

// Question: https://leetcode.com/problems/peak-index-in-a-mountain-array/
/*
    Mountain Array: A mountain array (a.k.a bitonic array) is an array of length
     at least 3 with elements strictly increasing from starting till an index i,
     and then strictly decreasing from index i to last index. The structure looks as following:
                 arr[0] < arr[1] < arr[i] >arr[i+1] > arr[i+2] > arr[N-1]
                 Example: arr = {1, 2, 3, 4, 9, 8, 7, 6, 5}
 */
// Here, we have to find the index of the largest number
// if (arr[mid] > arr[mid + 1]) => We will be in the descending part of the array
// and so end = mid
// if (arr[mid] < arr[mid + 1]) => We will be in the ascending part of the array
// and so start = mid + 1
// When will the loop break ? => While start and end both will point to the same element.

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9, 8, 7, 6, 5};
        int out = peakIndex(arr);

        System.out.println(out);
    }

    public static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = (start + end) / 2;

            if (arr[middle] > arr[middle + 1]) { // We are in the descending part
                end = middle; // This may be the answer, but check at the left part
                              // That's why end != mid - 1
            }
            else { // // We are in the ascending part
                start = middle + 1; // Since we know that (middle + 1)'s element > middle's element
            }
        }

        // In the end, start == end and pointing to the largest number because of the two checks above
        // start and end are always trying to find the maximum element in the above two checks
        // Hence, when they are pointing to just one element, that will be the max
        // At every point of time for start and end, they have the best possible answer till that time
        return start; // We can return start or end since both are equal
    }
}
