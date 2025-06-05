package yesithv.collections.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectArrays {
    public static void main(String[] args) {
        {
            Fruits f1 = Fruits.builder()
                    .color("Yellow")
                    .name("Banana")
                    .size(3).build();

            Fruits f2 = Fruits.builder()
                    .color("Apple")
                    .name("Red")
                    .size(2).build();

            Fruits[] fruits = {f1, f2};

            System.out.println("fruits.toString() = " + Arrays.toString(fruits));

            List<Fruits> fruitsList = new ArrayList<>();
            fruitsList.add(f1);
            fruitsList.add(f2);
            System.out.println("fruitsList.toString() = " + fruitsList.toString());
        }
    }
}