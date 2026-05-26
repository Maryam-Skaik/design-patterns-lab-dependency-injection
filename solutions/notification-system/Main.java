package di;

/**
 * Main class (Application Layer)
 *
 * Responsible for:
 * → Creating objects
 * → Choosing implementations
 * → Injecting dependencies
 *
 * Services do NOT create their dependencies.
 */
public class Main {

    public static void main(String[] args) {

        // --------------------------
        // Real implementation
        // --------------------------
        Notification email = new EmailNotification();

        // Inject same dependency into multiple services
        OrderService orderService = new OrderService(email);
        AccountService accountService = new AccountService(email);
        MarketingService marketingService = new MarketingService(email);

        orderService.placeOrder("ORD-1001");
        accountService.createAccount("maryam");
        marketingService.sendPromotion("Black Friday Sale");

        // --------------------------
        // Switching implementation
        // --------------------------
        System.out.println("\n--- Switching to SMS ---\n");

        Notification sms = new SMSNotification();

        OrderService orderService2 = new OrderService(sms);
        orderService2.placeOrder("ORD-2002");

        // --------------------------
        // Testing with fake dependency
        // --------------------------
        System.out.println("\n--- Testing with Fake Notification ---\n");

        Notification fake = new FakeNotification();

        MarketingService testMarketing = new MarketingService(fake);
        testMarketing.sendPromotion("Test Campaign");
    }
}
