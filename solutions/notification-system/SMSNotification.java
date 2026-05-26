package di;

/**
 * SMSNotification is another implementation of Notification.
 *
 * It represents sending notifications via SMS.
 */
public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
