package BinarySearch;

// Question: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Exact same approach as we used in ceiling and floor problems
// Ignore arr[mid] == target
// Wrap around means if no character larger than the target exist, return the first element

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char out = letterSearch(letters, target);

        System.out.println(out);
    }

    public static char letterSearch(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return arr[start % arr.length]; // When while loop violated (Start >= end) => start = arr.length

        // Or, if(start == arr.length) {
      //              return arr[0]; }
    }
}
