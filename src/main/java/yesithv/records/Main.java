package yesithv.records;

public class Main {
    public static void main(String[] args) {
        PersonDto p1 = new PersonDto("Jhon", 100);
        PersonDto p2 = new PersonDto("Jhon", 100);
        PersonDto p3 = new PersonDto("Martha", 200);

        // Getters:
        System.out.println("p1 name = " + p1.name());

        // equals:
        System.out.println("p1 equals p2 ? = " + (p1.equals(p2)));

        // hashCode:
        System.out.println("p2 hasCode p3 ? = " + (p2.hashCode() == p3.hashCode()));

    }
}
