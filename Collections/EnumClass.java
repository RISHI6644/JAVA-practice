package Collections;

public class EnumClass {
    public static void main(String[] args) {
        System.out.println("Let's learn about Enum in Java");

        /* Enums: enum is a special class that represents a group of constants (like final variables)
            To create an enum, use the enum keyword (instead of class or interface), and separate the
            constants with a comma. So we can define our own data type using enum class.
         */

         Week week;
         week = Week.Friday;

         for (Week day:Week.values()) {
             System.out.println(day);
         }

        System.out.println(week); // Friday
        System.out.println(Week.valueOf("Monday")); // It will actually return the value
                                                          // where enum constant = 'Monday'

        System.out.println(week.ordinal()); // Returns the position of the constant
    }

    enum Week {
        Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday // These are enum constants
        ;
        // They are by default public,
        // static and final members
        //  Since they are final we can
        //  create child enums
        // Here type of each constant is Week

        // Now let's see what happens when we create a constructor of enum class

        Week() {
            System.out.println("Constructor called for " + this.toString());
        }

        /* So when we run the code the constructor will be called for each and every constant
            no matter for which constant we try to call it. Why it acts like that ?
            => The constructor is not public or protected rather it is only private or default.
                The reason behind it is if we create a public or protected it will allow
                initialization of more than one objects (Which violates the enum concept).
                But here we only want fixed number of objects for 'Week'.

                So, internally it works like this:
                 public static final Week Friday = new Week();

            An enum cannot be used to create objects, and it cannot extend other classes
            (but it can implement interfaces).

            Why And When To Use Enums?
            => Use enums when you have values that you know are not going to change,
                like months, days, colors, deck of cards, etc.
         */
    }
}
