public class Main {
    public static void main(String[] args) {
        String str = "Let's learn Strings!";

        /* Strings in Java
        * A String is a Non-primitive data type which defines a sequence of characters.
        * Single line strings are defined with double quotes.
        * Multiline strings are defined with triple doubled quotes.

        */

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println("Let's Start!".length());

        String hobby_list = """
                                Reading
                                Gaming
                                Watching Movies
                            """;
        System.out.println(hobby_list);

        String s1 = "abc";
        String s2 = "abc";

        if (s1 == s2) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }

        String s3 = new String("abc");

        // if (s1 == s3)
        if (s1.equals(s3))
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }


        // String Concatenation
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Concatenated String: " + str1 + " " + str2);

        int x = 2441139;
        System.out.println(str1 + " " + x); // primitive data types are typecasted automatically to string

        int[] arr = {1, 2, 3};
        System.out.println(arr + " " + str1); // In case of non-primitive data types Java implicitly calls toString() method during concatenation


        // Reverse of a string
        String str3 = "Hello";
        String reverse = " ";
        for (int i = str3.length() - 1; i >= 0; i--) {
            reverse += str3.charAt(i);
        }
        System.out.println(reverse); // olleH


        // Strings vs char arrays
        String str5 = "Gracious"; // Immutable, stored in String pool
        char[] arr1 = {'G', 'r', 'a', 'c', 'i', 'o', 'u', 's'}; // Mutable, stored in Heap memory
        System.out.println(str5); // Gracious
        System.out.println(arr1); // Gracious

        // Conversion
        // String => char array
        char[] arr2 = str5.toCharArray();
        System.out.println(arr2); // Gracious

        // array => String
        String str6 = new String(arr1);
        System.out.println(str6);


        // stringBuilder class => used to create mutable string
        StringBuilder sb = new StringBuilder("I like coding");

        sb.append(" and drinking coffee");
        System.out.println(sb);

        sb.insert(13, ", gaming");
        System.out.println(sb);

        sb.replace(2, 6, "love");
        System.out.println(sb);

        sb.delete(13,21);
        System.out.println(sb);

        // How to convert a StringBuilder instance to a string
        String str4 = sb.toString();
        System.out.println(str4);
    }
}