package yesithv.solid.dependencyinversion;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {

    // Inject dependency to made more independent
    private final EmailNotification emailNotification;

    public void sendEmployeeNotification() {
        emailNotification.sendNotify();
    }
}
