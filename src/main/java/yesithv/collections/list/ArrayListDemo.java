package yesithv.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList: Dinámico: puede crecer cada vez que se agregan elementos
 * Orden: Mantiene el order de insersión
 * Permite duplicados
 * Acceso eficiente: Por elementos del índice
 * No sincronizado: No usar en entornos multihilo
 */
public class ArrayListDemo {
    /**
     * Métodos útiles como
     * add(),
     * remove(),
     * contains(),
     * indexOf()
     */
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Grapes");
        arrayList.add("Pineapple");
        // Add first and last:
        arrayList.addFirst("Orange");
        arrayList.addLast("Kiwi");
        System.out.println("arrayList = " + arrayList);

        // Acceso:
        System.out.println("Acceso por indice 2 = " + arrayList.get(2));
        System.out.println("Get first = " + arrayList.getFirst());
        System.out.println("Get last = " + arrayList.getLast());

        // Recorrido uno a uno:
        for (String fruit : arrayList) {
            System.out.println("Fruta: " + fruit);
        }

        // Si contiene un elemento
        System.out.println("Fruta: Apple está presente ? " + arrayList.contains("Apple"));

        // Remove elements:
        arrayList.remove("Banana");
        arrayList.removeFirst();
        arrayList.removeLast();
        System.out.println("arrayList despues de eliminar Banana y First y Last = " + arrayList);

    }
}
