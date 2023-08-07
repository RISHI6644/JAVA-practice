package LinearSearch;

// Question: https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 1, 3},
                {1, 2, 3}
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int person = 0; person < accounts.length; person++) {
            // Before iterating through each column lat us take a sum for that particular row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }

            // Now we have the sum of accounts wealth of a person
            // Checking with the current max
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
