package BinarySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's dive into Binary search!!!");

        /* Binary Search: Binary search is used to search a key element from multiple elements.
            It is faster than linear search.In case of binary search, array elements has to be
            sorted in ascending or descending order.

            Let's assume the array is sorted in ascending order. So, the algorithm first compares
            the key with the element in the middle of the array. And we can find the middle element
            by using the following calculation:
                middle index = (starting index + end index) / 2;

            Now, Consider the following three cases:
            i) if(key < arr[middle]) => we need to continue to search for the key only in the left or
                first half of the array
            ii) if(key == arr[middle]) => the search ends with a match
            iii) if(key > arr[middle]) => we need to continue to search for the key only in the right or
                second half of the array.

            Now what if the array is sorted in descending order ?
            => In this case consider the following three cases:
                i) if(key < arr[middle]) => we need to continue to search for the key only in the right or
                    second half of the array.
                ii) if(key == arr[middle]) => the search ends with a match
                iii) if(key > arr[middle]) =>  we need to continue to search for the key only in the left or
                first half of the array

            In both of the cases, if start > end then it can be said that element not found.

            Why Binary Search ?
            => The binary search method eliminates at least half of the array after each comparison.

               Time Complexity: In best case scenario, key will be found at the middle index. So it will be O(1).
                In worst case scenario, we need to find the maximum number of comparisons:
                    Let's consider an array of N length. If we start performing binary search on this array to
                    search a key element then after the first comparison, N/2 elements will be left; After the
                    second comparison, (N/2)/2 or, N/4 elements will be left.
                    Similarly, we can say, after kth comparison, N/2^k elements will be left. And in the last level,
                    Only one element will be left means we will have, N/2^k = 1 => N = 2^k
                    Now, taking (log) on both sides we get, log(N) = log(2^k) => log(N) = klog(2)
                                                                              => k = log(N) / log(2)
                                                                              => k = log_2(N)
                    Here, k basically represents the total no. of comparisons which is log_2(N).
                    For example, If an array consists of 1024 or, 2^10 elements to search a key
                    using linear search it will require 1023 comparisons in the worst case whereas
                    binary search will require only 10 comparisons.
         */

        int[] arr = {-18, -5, 2, 4, 9, 12, 16, 18, 22, 45, 74};
        int target = 22;
        int out = binarySearch(arr, target);

        System.out.println(out);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            /* Since type int has a fixed range (-2147483648 to 2147483647), so after some amount of value,
                we cannot take input in integer.
                 let assume, we have taken a really large value for start and end; So there might be a
                 possibility that (start + end) exceeds the range of int in java

                 Example: start = 2147483640
                          end = 2147483645
                          mid =   (2147483640 + 2147483645) / 2 => 4294967285 (Out of range)

                          mid2 =   2147483640 + ((2147483645 - 2147483640) / 2) => 2147483642 (In range)

                 So to avoid this we can use the following approach
                    int mid = start + (end - start) / 2;
             */

            if (target < arr[middle]) {
                end = middle - 1;
            }
            else if (target > arr[middle]) {
                start = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
