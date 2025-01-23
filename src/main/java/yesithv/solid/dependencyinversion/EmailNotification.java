package yesithv.solid.dependencyinversion;

public class EmailNotification implements Notification {

    @Override
    public void sendNotify() {
        System.out.println("Sending email notification ...");
    }
}
