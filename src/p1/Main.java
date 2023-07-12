package p1;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<>();
        states.add("Germany");
        states.add("Austria");
        states.add("Russia");
        states.add("Great Britain");


        for (String state: states) {
            System.out.println(state);
        }

        System.out.println(states.first());

        SortedSet<String> set = states.subSet("Germany", "Russia");
        System.out.println(set);

        NavigableSet<String> navSet = states.descendingSet();
        System.out.println(navSet);

        SortedSet<String> setL = states.headSet("Germany", false);
        System.out.println(setL);

    }
}
