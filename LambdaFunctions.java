import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        System.out.println("Let's learn about lambda functions in Java!!!");

        /* Lambda Functions: These are in-line(one line) functions which takes
            in parameters and returns a value.
         */
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        arr.forEach((item) ->  System.out.println(item * 2));

        // Alternative approach
        Consumer<Integer> func = (item) -> System.out.println(item * 2);
        arr.forEach(func);

        // By using interface
        Operation sum = ((a, b) -> a + b);
        Operation sub = ((a, b) -> a - b);
        Operation mul = ((a, b) -> a * b);
        Operation div = ((a, b) -> a / b);

        LambdaFunctions func2 = new LambdaFunctions();
        System.out.println(func2.operate(5,3, sub));
        System.out.println(func2.operate(5,3, sum));
        System.out.println(func2.operate(5,3, mul));
    }

    int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
