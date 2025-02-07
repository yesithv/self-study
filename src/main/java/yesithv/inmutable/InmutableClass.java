package yesithv.inmutable;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public final class InmutableClass {
    private final String name;
    private final Integer age;
    private final List<String> hobbies;

    public InmutableClass(String name, Integer age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }
}
