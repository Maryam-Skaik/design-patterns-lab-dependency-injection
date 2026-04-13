package di;

/**
 * CheckoutService handles the checkout process.
 * 
 * IMPORTANT DESIGN POINT:
 * → This class does NOT create the Payment object
 * → It RECEIVES it from outside (Dependency Injection)
 */
public class CheckoutService {

    // Dependency on Payment (abstraction, not implementation)
    private Payment payment;

    /**
     * Constructor Injection:
     * 
     * The Payment dependency is passed from outside.
     * This makes the dependency:
     * → Visible
     * → Replaceable
     * → Flexible
     */
    public CheckoutService(Payment payment) {
        this.payment = payment;
    }

    /**
     * Business logic: checkout process
     * 
     * The service uses the dependency,
     * but does not know or care which implementation is used.
     */
    public void checkout(double amount) {
        payment.pay(amount);
    }
}
