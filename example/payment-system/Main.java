package di;

/**
 * Main class (Application Layer)
 * 
 * This is where object creation happens.
 * 
 * VERY IMPORTANT:
 * → This class is responsible for:
 *    - Creating objects
 *    - Choosing implementations
 *    - Injecting dependencies into services
 * 
 * → Services DO NOT create their dependencies
 */
public class Main {

    public static void main(String[] args) {

        // Step 1: Create a real implementation
        Payment payment = new StripePayment();

        // Step 2: Inject dependency into CheckoutService
        CheckoutService checkoutService = new CheckoutService(payment);
        checkoutService.checkout(1550);

        // Step 3: Inject the same dependency into RefundService
        RefundService refundService = new RefundService(payment);
        refundService.refund(4000);

        // ------------------------------
        // Testing with a fake dependency
        // ------------------------------

        // Step 4: Create fake implementation
        Payment fake = new FakePayment();

        // Step 5: Inject fake dependency for testing
        CheckoutService test = new CheckoutService(fake);
        test.checkout(455);

        /**
         * Key Observations:
         * 
         * 1. Services did NOT change at all
         * 2. Only the injected object changed
         * 3. Same service works for:
         *    - Real payment (Stripe)
         *    - Fake testing
         * 
         * This is the power of Dependency Injection.
         */
    }
}
