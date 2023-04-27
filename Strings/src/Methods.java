public class Methods {
    public static void main(String[]args) {
        String str1 = "Hello World";

        // charAt()
        System.out.println(str1.charAt(0)); // H
        System.out.println(str1.charAt(str1.length() - 1)); // d

        // length()
        System.out.println(str1.length()); // 11

        // indexOf() => returns the index of the 'first occurrence' of the specified element.Returns -1 when the element is not present.
        System.out.println(str1.indexOf('o')); // 4
        System.out.println(str1.indexOf("ll")); // 2
        System.out.println(str1.indexOf("abc")); // -1

        // equals => compare whether two strings contain the same sequence of characters or not
        String str2 = new String("Hello World");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // false

        // contains => returns true if & only if the string contains the specified sequence of character values
        System.out.println(str1.contains("llo")); // true
        System.out.println(str2.contains("abc")); // false

        // toLowerCase, toUpperCase => returns new strings (do not replace the current string) after changing the case
        System.out.println(str1.toLowerCase()); // hello world
        System.out.println(str2.toUpperCase()); // HELLO WORLD

        //replace => takes target string and replacement string as parameter and returns a new string by replacing the target
        String str3 = "I Love Programming";
        String str4 = str3.replace("Programming", "Java");
        System.out.println(str4); // I Love Java

        // substring => returns a substring of a string. it takes a range (startIndex, endIndex) as parameter.
        System.out.println(str3.substring(2,8));
        System.out.println(str3.substring(7));
    }
}