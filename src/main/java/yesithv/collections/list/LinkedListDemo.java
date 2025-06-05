package yesithv.collections.list;

import java.util.LinkedList;

/**
 * Muy similar al ArrayList
 * Ideal para recorrer
 * Last In First Out => LIFO
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Google");
        linkedList.add("Yahoo");
        linkedList.add("Yahoo");
        linkedList.add("Youtube");
        // Add first and last:
        linkedList.addFirst("Microsoft");
        linkedList.addLast("Apple");
        System.out.println("linkedList = " + linkedList);

        // Acceso a elementos:
        System.out.println("index access by 2 = " + linkedList.get(2));
        System.out.println("Get First = " + linkedList.getFirst());
        System.out.println("Get Last = " + linkedList.getLast());

        // Get one by one element:
        for (String item : linkedList) {
            System.out.println("Company: " + item);
        }

        // Contaions ?
        System.out.println("Is Google present ? " + linkedList.contains("Google"));

        // Remove elements:
        linkedList.remove("Google");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After delete Google, first and last = " + linkedList);

        // Use like a stack:
        // LIFO
        linkedList.push("Tesla");
        System.out.println("after push Tesla= " + linkedList);
        String getAndRemoveFirst = linkedList.poll();
        System.out.println("getAndRemoveFirst: " + getAndRemoveFirst + ". After poll() " + linkedList);
        String getNotRemoveFirst = linkedList.peek();
        System.out.println("getNotRemoveFirst: " + getNotRemoveFirst + ". After peek() " + linkedList);
        String getRemoveFirst = linkedList.pop();
        System.out.println("getRemoveFirst: " + getRemoveFirst + ". After pop() " + linkedList);

    }
}
