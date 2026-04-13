package di;

/**
 * StripePayment is another implementation of Payment.
 * 
 * This shows how the system can support multiple payment methods
 * without changing the services.
 */
public class StripePayment implements Payment {

    /**
     * Implementation of the pay method using Stripe.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Paid with Stripe: " + amount);
    }
}
