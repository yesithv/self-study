package yesithv.inmutable;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String name = "Jhon Doe";
        Integer age = 45;
        List<String> hobbies = Arrays.asList("Running", "Walking");
        InmutableClass person = new InmutableClass(name, age, hobbies);
        System.out.println("person = " + person);

        // Attempt to modify the hobbies list exernaly
        hobbies.set(0, "Flying");
        name = "Maria Puspan";
        age = 85;
        System.out.println("person = " + person);
    }
}
