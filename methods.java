package csw;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
public class methods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // add elements to the set
        set.add("iPhone12");
        set.add("iPhone13");
        set.add("iPhone14");
        // remove an element from the set
        set.remove("iPhone13");
        // check if an element is present in the set
        boolean isPresent = set.contains("iPhone12");
        System.out.println("iPhone12 is present in the set: " + isPresent);
        // check if the set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Set is empty: " + isEmpty);
        // clear the set
        set.clear();
        // add a LinkedList to a HashSet
        LinkedList<String> list = new LinkedList<>();
        list.add("iPhone12");
        list.add("iPhone13");
        list.add("iPhone14");
        Set<String> set2 = new HashSet<>(list);
        System.out.println("Contents of HashSet: " + set2);




    }

}
