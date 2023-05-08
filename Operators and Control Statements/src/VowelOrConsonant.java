import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println("vowel");
            }
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j' -> {
                System.out.println("Consonant");
            }
            default -> {
                System.out.println("Invalid input");
            }
        }
    }
}