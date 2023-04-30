/* Problem Description
Given three integers, A, B and C. You have to find the number of days it will take to reach zero cases of Corona in a city.

A - Average cases recovered in a day of the corona.
B - Number of new cases of corona daily.
C - Current active cases of the corona.

Return the minimum number of days it will take to reach 0 active cases of Covid. */

public class EndCorona {
    public static int solve(int A, int B, int C) {
        int days = 0;
        while (C > 0) {
            days++;
            C = (B + C) - A;
        }
        return days;
    }

    public static void main(String[] args) {
        int case1 = solve(5, 3, 1);
        System.out.println(case1);

        int case2 = solve(4, 3, 2);
        System.out.println(case2);

        int case3 = solve(5, 4, 2);
        System.out.println(case3);
    }
}