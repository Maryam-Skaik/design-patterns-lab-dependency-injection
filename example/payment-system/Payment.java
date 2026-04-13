package di;

/**
 * Payment is an abstraction (interface).
 * 
 * It defines a general behavior (pay), without specifying how the payment happens.
 * 
 * This is very important in Dependency Injection:
 * → We depend on "what the object does" (behavior)
 * → Not on "how it is implemented" (PayPal, Stripe, etc.)
 */
public interface Payment {
    
    /**
     * This method represents the payment operation.
     * Any class that implements Payment must provide its own version.
     */
    public void pay(double amount);
}
