package LinearSearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Rishi";
        char target = 'i';
        System.out.println(searchString(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean searchString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // By using for-each loop
        for (char ch:str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        // By using for loop
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
