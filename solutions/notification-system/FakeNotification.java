package di;

/**
 * FakeNotification is used for testing purposes.
 *
 * It simulates notification behavior without real delivery.
 *
 * This demonstrates one of the strongest benefits of DI:
 * → Easy testing without external systems
 */
public class FakeNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("FAKE notification: " + message);
    }
}
