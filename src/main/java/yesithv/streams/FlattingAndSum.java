package yesithv.streams;

import java.util.ArrayList;
import java.util.List;

public class FlattingAndSum {
    public static void main(String[] args) {
        List<Item> list1 = new ArrayList<>();
        list1.add(new Item("I1", 100));
        list1.add(new Item("I2", 200));

        List<Item> list2 = new ArrayList<>();
        list2.add(new Item("I3", 20));
        list2.add(new Item("I4", 10));

        List<Basket> baskets = new ArrayList<>();
        baskets.add(new Basket("b1", list1));
        baskets.add(new Basket("b2", list2));


        var sum = baskets.stream()
                // Flat map to Items
                .flatMap(basket -> basket.items().stream())
                .mapToInt(item -> item.value())
                .sum();

        System.out.println("The sum is: " + sum);
    }


}

record Basket(String name, List<Item> items) {
}

record Item(String name, Integer value) {
}
