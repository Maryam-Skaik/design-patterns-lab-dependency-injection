package di;

/**
 * Notification is an abstraction (interface).
 *
 * It defines a general behavior for sending notifications,
 * without specifying how the notification is delivered.
 *
 * This is the core of Dependency Injection:
 * → Services depend on behavior, not implementation
 */
public interface Notification {

    /**
     * Send a message to a user.
     */
    public void send(String message);
}
