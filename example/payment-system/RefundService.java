package di;

/**
 * RefundService handles refund operations.
 * 
 * Like CheckoutService:
 * → It depends on Payment
 * → It does NOT create Payment
 * → It receives it via Dependency Injection
 */
public class RefundService {

    private Payment payment;

    /**
     * Constructor Injection
     */
    public RefundService(Payment payment) {
        this.payment = payment;
    }

    /**
     * Business logic: refund process
     */
    public void refund(double amount) {
        payment.pay(amount);
    }
}
