package di;

/**
 * PushNotification is an additional implementation.
 *
 * This shows how the system can be extended without modifying services.
 */
public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Push notification sent: " + message);
    }
}
