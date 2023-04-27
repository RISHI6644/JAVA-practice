public class Main {
    public static void main(String[] args) {
        String str = "Let's learn Strings!";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println("Let's Start!".length());

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
    }
}