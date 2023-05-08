public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about operators and control statements!");

        // Arithmetic Operators: used to perform arithmetic operations on variables and data
        int a = 10;
        int b = 4;

        int sum = a + b; // Addition
        int sub = a - b; // Subtraction
        int mul = a * b; // Multiplication
        int div = a / b; // Division
        int mod = a % b; // Modulo operator - To find the remainder

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div); // 2
        System.out.println(a / (float) b); // 2.5
        System.out.println(mod); // 2

        // Relational Operators: used to check some relationship between two operands.
        int x = 10;
        int y = 5;

        System.out.println(x == y); // false
        System.out.println(x > y); // true
        System.out.println(x < y); // false
        System.out.println(x >= y); // true
        System.out.println(x <= y); // false
        System.out.println(x != y); // true

        /* Assignment Operator vs Equality Operator
            Assignment Operator: "=" is known as assignment operator. It is used to assign the value on the right to
                                    the variable on the left.
            Equality Operator: "==" is known as equality operator. It is used to check whether two items are equal in
                                    value or not.
         */
        int p = 5;
        float q = 3.32F;

        System.out.println(p == 5); // true
        System.out.println(q == 2); // false

        /* Ternary Operator: It is a condensed form of if-else statement which evaluates a condition and executes the
                             code based on the evaluated condition.
                             syntax => result = (condition) ? expression1 : expression2
         */

        int num = 5;
        String ans = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(ans);

        /* Logical Operators: These operators are used making decisions in programming based on some other conditions.
            There are three types of logical operators in Java: AND, OR, NOT
         */

        /* Logical AND (&) => It takes two expressions and returns true if both the expressions are true. Else it returns
                               false.
                               So, when the first expression returns false we do not need to check the second one. That
                               is where Logical short circuit AND *(&&) is used. This operator doesn't even check the
                               second expression when the first one returns false.
                             */
        int age = 24;
        String citizenship = "Bangladeshi";

        if (age > 18 & citizenship == "Bangladeshi") {
            System.out.println("The person may vote");
        }
        else {
            System.out.println("The person cannot vote");
        }

        int age2 = 17;

        if (age2 > 18 && citizenship == "Bangladeshi") {
            System.out.println("The person may vote");
        }
        else {
            System.out.println("The person cannot vote");
        }

        /* Logical OR (|): It takes two expressions and returns true if either one of the two expressions is true.
            Else it returns false.
            So, when the first expression returns true we do not need to check the second one. That
            is where Logical short circuit OR (||) is used. This operator doesn't even check the
            second expression when the first one returns true.
        */

        String song = "Perfect";

        if (song == "Perfect" | song == "Photograph") {
            System.out.println("by Ed Sheeran");
        }
        else {
            System.out.println("not Ed Sheeran's");
        }

        if (song == "Perfect" || song == "Photograph") {
            System.out.println("by Ed Sheeran");
        }
        else {
            System.out.println("not Ed Sheeran's");
        }

        // Logical NOT: this operator return the negation of a boolean value.

        boolean flag = false;

        if (!flag) {
            System.out.println("This line is executed since flag returned true");
        }
    }
}