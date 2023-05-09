/* Write a program to generate random numbers between [2, 20] and print them to the output. Terminate when you get 5.
    Skip all multiples of 4.
    To generate random number we need to use an infinite loop. Also, we can use Math.random() function.
 */

public class RandomNumber {
    public static void main(String[]args){
        // Infinite loop
        while (true) {
            int number = (int) (Math.random() * (20 - 2 + 1) + 2); // [2, 20] is the range.
            if (number == 5) {
                break;
            }
            if (number % 4 == 0) {
                System.out.print( " " + "Multiple of 4");
                continue;
            }
            System.out.print(" " + number);
        }
    }
}