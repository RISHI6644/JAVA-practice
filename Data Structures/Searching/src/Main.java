public class Main {
    public static void main(String[] args) {
        System.out.println("Let's start learning about searching!!!");

        /* Searching: Searching is the process of finding an item with specified properties
            from a collection of items. The items may be stored as simple data elements in arrays,
            nodes in trees, text in files, records in a database, vertices and edges in graphs,
            or they may be elements of other search spaces.

            Why do we need Searching?
            => Searching is one of the core computer science algorithms. We know that today’s computers
                store a lot of information. To retrieve this information proficiently we need very efficient
                searching algorithms.
         */

        int[] arr = {18, 30, 10, 74};

        // Find the index where the element is 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                System.out.println(i);
            }
        }
    }
}
