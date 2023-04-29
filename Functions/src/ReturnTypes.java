public class ReturnTypes {
    public static void main(String[]args) {
        System.out.println("Let's learn about the return types of functions");
        hello();
        System.out.println(square(10));

        String[] arr = superHeroes();
        for (String hero:arr) {
            System.out.println(hero);
        }
    }

    // void => if we do not want to return any type
    static void hello() {
        System.out.println("Hello World !!!");
    }

    static int square(int num) {
        return num * num;
    }

    static String[] superHeroes () {
        String[] heroes = {"Batman", "Captain America", "Thor"};
        return heroes;
    }
}
