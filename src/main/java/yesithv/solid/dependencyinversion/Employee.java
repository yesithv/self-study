package yesithv.solid.dependencyinversion;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {
    private final EmailNotification emailNotification;

    public void sendEmployeeNotification() {
        emailNotification.sendNotify();
    }
}
