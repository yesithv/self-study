package yesithv.streams;

import yesithv.records.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattingAndSum {
    public static void main(String[] args) {
        List<Item> l1 = new ArrayList<>();
        l1.add(new Item("I1", 100));
        l1.add(new Item("I2", 200));
        List<Item> l2 = new ArrayList<>();
        l2.add(new Item("I3", 20));
        l2.add(new Item("I4", 10));

        List<Basket> baskets = new ArrayList<>();
        baskets.add(new Basket("b1", l1));
        baskets.add(new Basket("b2", l2));


        var sum = baskets.stream()
                // Flat map to Items
                .flatMap(basket -> basket.items().stream())
                .mapToInt(Item::value)
                .sum();
    }


}

record Basket(String name, List<Item> items) {
}

record Item(String name, Integer value) {
}
