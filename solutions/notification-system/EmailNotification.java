package di;

/**
 * EmailNotification is a concrete implementation of Notification.
 *
 * It represents sending notifications via Email.
 */
public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
