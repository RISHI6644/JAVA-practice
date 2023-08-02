package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's dive into collection framework!!!");

        /* collection framework: It is a framework that provides an architecture to store
            and manipulate the group of objects. Java Collections can achieve all the
            operations that you perform on a data such as searching, sorting, insertion,
            manipulation, and deletion.
            Java Collection means a single unit of objects. Java Collection framework provides
            many interfaces (i.e. Set, List, Queue, Deque) and classes (i.e. ArrayList, Vector,
            LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
         */

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list1.add(2);
        list2.add(25);

        list1.size();
        list2.size();

        System.out.println(list1);
        System.out.println(list2);
    }
}
