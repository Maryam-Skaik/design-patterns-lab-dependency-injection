package di;

/**
 * OrderService handles order-related operations.
 *
 * It depends on Notification abstraction.
 * It does NOT create notification objects.
 */
public class OrderService {

    private Notification notification;

    /**
     * Constructor Injection
     */
    public OrderService(Notification notification) {
        this.notification = notification;
    }

    /**
     * Business logic: order placed
     */
    public void placeOrder(String orderId) {
        notification.send("Order placed successfully: " + orderId);
    }
}
