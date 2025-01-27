package yesithv.records;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jhon", 100);
        Person p2 = new Person("Jhon", 100);
        Person p3 = new Person("Martha", 200);

        // Getters:
        System.out.println("p1 name = " + p1.name());

        // equals:
        System.out.println("p1 equals p2 ? = " + (p1.equals(p2)));

        // hashCode:
        System.out.println("p2 hasCode p3 ? = " + (p2.hashCode() == p3.hashCode()));

    }
}
