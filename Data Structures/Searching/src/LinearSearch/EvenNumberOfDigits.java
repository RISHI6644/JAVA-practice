package LinearSearch;

// Question: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

/*
    Goal: Find the amount of elements having even no. of digits. For example:
        input: numbers = {18, 124, 9, 1764, 98, 1};
        output: 3

    Tips: How to know whether a number contains even number of digits or not ?
          => Let's consider the number 1764. So, to check the number of digits it holds,
              we can do the following steps:
              i) Count the number of digits by using a while loop where we can divide
                  the number by 10 until it becomes 0.
              or, ii) Convert the number into a String and then consider its length
 */

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {18, 124, 9, 1764, 98, 1};
        System.out.println(evenNumberOfDigits(arr));

        System.out.println(numberOfDigits(18301074));
        System.out.println(numberOfDigits(-6251));

        System.out.println(numberOfDigits2(1223));
        System.out.println(numberOfDigits2(-13091));
        System.out.println(numberOfDigits2(0));
    }

    public static int evenNumberOfDigits(int[] arr) {
        int count = 0;

        for (int num:arr) {
            if (evenNum(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains even number of digits or not
    public static boolean evenNum(int num) {
        int number_of_digits = numberOfDigits(num);

        if (number_of_digits % 2 == 0) {
            return true;
        }
        return false;

        // return number_of_digits % 2 == 0; This is the shortcut to avoid if-else
    }

    // Count the number of digits in a number
    public static int numberOfDigits(int num) {
        int count = 0;

        // If there exist any negative number, then we'll need to convert it to positive
        if (num < 0) {
            num = num * -1;
        }

        // If the number 0 exist in the array its digit would be 1
        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }

    // There is an optimized method exist to count the digits
    public static int numberOfDigits2(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
