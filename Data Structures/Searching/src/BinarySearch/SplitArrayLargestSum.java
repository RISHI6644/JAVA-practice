package BinarySearch;

// Question: https://leetcode.com/problems/split-array-largest-sum/

/*
    Consider the given example, Input: arr = [7,2,5,10,8], k = 2. There are four ways
     to split arr into two sub-arrays:
        i) [7] & [2, 5, 10, 8] where maximum sum is 25
        ii) [7, 2] & [5, 10, 8] where maximum sum is 23
        iii) [7, 2, 5, 10] & [8] where maximum sum is 24
        iv) [7, 2, 5] & [10, 8] where maximum sum is 18
    Here, we can see the minimized largest sum of the spilt arrays is 18. So, Output will be 18

    While, splitting an array,
     Case 1: Minimum number of partitions that we can make is 1,
      means when k = 1 we can take the entire array itself. And so in this case, the
      largest sum will be the sum of all the elements of the array itself.

    Case 2: Maximum number of partitions that can be made is N. Let's say, we have an array
     [3, 4, 1, 2] and when k = 4 we can split this array in maximum chunks, And we will get these
     sub-arrays:
     [3], [4], [1], [2]. And so in this case, the largest sum will be the maximum element of
     the array.

    So, we can say that, Maximum value of the sum will be found in case 1 (when k = 1)
                         Minimum value of the sum will be found in case 2 (when k = size of the array)
        In other words, minimum sum = maximum element in an array
                        maximum sum = sum of all elements in an array
 */

/*
    Let's start with the LeetCode example again: arr = [7,2,5,10,8]. Here, maximum value of the sum
        will be 32. And minimum value of the sum will be the largest element of the array which is 10.
        So, we have [lower limit, Upper limit] = [10, 32]
        Now, let start = 10; end = 32
               mid = (10 + 32) / 2; => 21 (This may be a potential answer)
         Okay, now let's try to split the array into sub-arrays with 21 as the maximum sum
               We can split like this: [7, 2, 5] & [8, 10] and so total no. of chunks are 2
   Check 1:     So, if(chunks <= k) => end = mid;
                   So, now [lower limit, Upper limit] = [10, 21]
                                               mid = 15
         Okay, now let's try to split the array into sub-arrays with 15 as the maximum sum
                We can split like this: [7, 2, 5], [8] & [10] and now total no. of chunks are 3
   Check 2:     So, if(chunks > k) => start = mid + 1;
                    So, now [lower limit, Upper limit] = [16, 21]
                                               mid = 18
         Okay, now let's try to split the array into sub-arrays with 18 as the maximum sum
                We can split like this: [7, 2, 5], [8, 10] and now total no. of chunks are 2
                So, again (chunks <= k) => end = mid;
                    So, now [lower limit, Upper limit] = [16, 18]
                                               mid = 17
         Okay, now let's try to split the array into sub-arrays with 17 as the maximum sum
                We can split like this: [7, 2, 5], [8] & [10] and now total no. of chunks are 3
                So, again (chunks > k) => start = mid + 1;
                    So, now [lower limit, Upper limit] = [18, 18]
                                               mid = 18 (And that will be the output)
 */

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;

        System.out.println(splitArray(arr, k));

        int[] arr2 = {1,2,3,4,5};
        int k2 = 2;

        System.out.println(splitArray(arr2, k2));
    }

    public static int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]); // In the end of the loop it will contain the maximum item from the array
            end = end + arr[i];

            // Now, apply binary search
            while (start < end) {
                // Try for the middle as potential output
                int middle = (start + end) / 2;

                // Calculate the no. of chunks we can divide the array with this maximum sum
                int max_sum = 0;
                int num_of_chunks = 1;
                for (int num : arr) {
                    if (max_sum + num > middle) { // We cannot add this in current sub-array, so make a new one
                        // So start the new sub-array with this num means max_sum = num
                        max_sum = num;
                        num_of_chunks++;
                    }
                    else {
                        max_sum = max_sum + num;
                    }
                }

                if (num_of_chunks > k) {
                    start = middle + 1;
                }
                else {
                    end = middle;
                }
            }
        }
        return start; // Since, at the end, start == end
    }
}
