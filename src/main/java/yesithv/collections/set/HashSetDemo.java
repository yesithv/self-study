package yesithv.collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * HASH SET:
 * No almacena en orden
 * No permite duplicados
 * Permite NULL
 * Eficiente para operaciones add/remove/contains
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // Create:
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Firefox");
        hashSet.add("Chrome");
        hashSet.add("Safari");
        hashSet.add("Explorer");
        hashSet.add("Opera"); hashSet.add("Opera"); // Duplicate: dont allowed
        hashSet.add(null);  // Allows storage null elements
        System.out.println("set = " + hashSet);

        // Contains:
        System.out.println("Contains 'Safari' ? = " + hashSet.contains("Safari"));

        // Remove:
        hashSet.remove("Explorer");
        System.out.println("After remove 'Explorer' = " + hashSet);

        // Iteration:
        for (String item : hashSet) {
            System.out.println("Browser = " + item);
        }

        // Utils methods:
        System.out.println("hashSet.size() = " + hashSet.size());
        System.out.println("hashSet.isEmpty() = " + hashSet.isEmpty());
        hashSet.clear();
        System.out.println("hashSet.clear(); = " + hashSet);
    }
}
