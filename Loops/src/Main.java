public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about loops in Java!");

        /* For loop: It is used to execute a block in a code for a certain number of times. It is recommended to use
                        for loop when the exact number of iterations is known beforehand.
                        The syntax of for loop is as following:
                        for (initialization; condition; update) {
                            // body of the loop
                        }
         */

        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        /* While loop:It is used to execute a specific block of code until a certain condition is met.
            The syntax of while loop is os following:
            while (condition) {
                // body of the loop
              }
         */

        int x = 1;

        while (x <= 5) {
            System.out.print(" " + x);
            x++;
        }
        System.out.println();

        /* do-while loop: It is very similar to the while loop. However, the body of do-while is once before the
            condition is checked.
            The syntax of do-while loop is as following:
            do {
                // body of the loop
               } while (condition)
         */

        int y = -5;

        do {
            System.out.println(y);
        } while (y > 0);

        /* break statement is used to terminate a loop in which it is enclosed. The program resumes control at the next
            statement following the loop
         */

        for (int p = 1; p <= 10; p++) {
            if (p == 5) {
                break;
            }
            System.out.print(" " + p);
        }
    }
}
