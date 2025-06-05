package yesithv.collections.set;

import java.util.TreeSet;

/**
 * TREE SET:
 * Ordenado por orden natural o comparador
 * No almacena duplicados
 * No permite null
 * Más lento que el HashSet
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Alfa");
        treeSet.add("Beta");
        treeSet.add("Gamma");
        treeSet.add("Delta");
        // treeSet.add(null); dont storage NULL elements
        treeSet.add("Epsilon");
        treeSet.add("Epsilon"); // Dont storage duplicates
        System.out.println(treeSet);

        // Contains:
        System.out.println("treeSet.contains(\"Alfa\") ? = " + treeSet.contains("Alfa"));

        // Remove:
        treeSet.remove("Gamma");
        System.out.println("After remove \"Gamma\"  = " + treeSet);

        // Iteration:
        for (String item : treeSet) {
            System.out.println("Symbol: " + item);
        }

        // Utils methods:
        System.out.println("treeSet.first() = " + treeSet.first());
        System.out.println("treeSet.last() = " + treeSet.last());
        System.out.println("treeSet.higher(\"Beta\") = " + treeSet.higher("Beta"));
        System.out.println("treeSet.lower(\"Beta\") = " + treeSet.lower("Beta"));
    }
}
