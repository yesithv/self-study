package yesithv.solid.dependencyinversion;

/**
 * DEPENDENCY INVERSION:
 * Decoupling of software modules,Instead of high-level modules depending on low-level modules,
 * both will depend on abstractions
 */
public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee(new EmailNotification());
        e1.sendEmployeeNotification();
    }

}
