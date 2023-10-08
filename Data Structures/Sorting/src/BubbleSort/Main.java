package BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Bubble Sort Algorithm");

        /* Bubble Sort: In bubble sort algorithm, array is traversed from first element to last element.
            Here, current element is compared with the next element (adjacent element). If current element
            is greater than the next element, it is swapped.
           Bubble sort algorithm is known as the simplest sorting algorithm. It is also known as "Sinking Sort"
            or "Exchange Sort".
           This algorithm sorts the array in multiple passes. Each pass successively swaps the adjacent elements
            if the elements are not in order.

           Consider the following example:
           Let's say, we have an array, arr = [3, 1, 5, 4, 2]
           After the first pass, the largest element comes to the last index. So, arr1 = [1, 3, 4, 2, 5]
           After the second pass, the second-largest element comes to the index second-to-last. So, arr2 = [1, 3, 2, 4, 5]
           After the third pass, the third-largest element comes to the index third-to-last. So, arr3 = [1, 2, 3, 4, 5]

           This process continues until all elements are sorted.
           After each successful pass, we do not need to compare the last pair as the largest element will already be
            placed at the last index.
         */

        /* Complexity of Bubble sort : Space Complexity - O(1), since no extra space such as copying the array etc.
            is required. That is why it is also known as "In-place sorting algorithms".
           Time Complexity: In best case, O(n) => when the array is sorted (loop will run once)
                            In worst case, O(n^2) => when the array is sorted in opposite order
                        So, we can notice that as the size of the array is growing, the number of comparisons
                         are also growing.
         */

        /* Stable Sorting Algorithm: Stable sorting algorithms maintain the relative order of records with equal keys
            (i.e. values). That is, a sorting algorithm is stable if whenever there are two records R and S with the
            same key and with R appearing before S in the original list, R will appear before S in the sorted list.
           In other words, when a collection is sorted with a stable sorting algorithm, items with the same sort keys
            preserve their order after the collection is sorted.

          Unstable Sorting Algorithm: Unstable sorting algorithm does not maintain the relative order of records with
           equal keys (i.e. values). That is, a sorting algorithm is unstable if whenever there are two records R and
           S with the same key and with R appearing before S in the original list, R will not appear before S in the
           sorted list.
          In other words, when a collection is sorted with an unstable sorting algorithm, items with the same sort keys
            will not preserve their order after the collection is sorted.

          Bubble sort is a stable sorting algorithm
         */

        int[] arr = {3, 1, 5, 4, 2};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        // run the steps for n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, largest element will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) { // swapped = true
                break;
            }
        }
    }
}
