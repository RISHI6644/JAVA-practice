public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Functions in Java!");

        String name = "Rishikesh Das";
        int age = 24;
        String[] hobbies = {"Reading", "Gaming", "Traveling"};

        // calling methods
        introduce(name, age, hobbies);
        makingTea();
        makingCoffee();

        float avg1 = getAverage(2, 5, 7, 10, 12);
        float avg2 = getAverage(5, 10, 15);

        System.out.println(avg1);
        System.out.println(avg2);
    }

    // Parameters and arguments
    static void introduce(String name, int age, String[] hobbies){
        System.out.println("Myself " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My hobbies are: ");
        for (String hobby:hobbies) {
            System.out.println("_ " + hobby);
        }
    }

    // Function for making tea
    static void makingTea() {
        System.out.println("Boil water with tea leaves and sugar");
        System.out.println("Add milk and boil for a few minutes");
        System.out.println("Serve the milk tea");
    }

    // Function for making coffee
    static void makingCoffee() {
        System.out.println("Boil some milk");
        System.out.println("Put some coffee in the cup");
        System.out.println("Pour the milk into the cup");
    }

    // Variable Arguments (...varargs) => to take variable number of values as parameters
    static float getAverage(float ...varargs) {
        System.out.println(varargs.getClass().getSimpleName());
        float sum = 0;
        for (float num:varargs) {
            sum += num;
        }
        return sum / varargs.length;
    }
}