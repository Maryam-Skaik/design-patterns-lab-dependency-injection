package di;

/**
 * PayPalPayment is a concrete implementation of Payment.
 * 
 * It provides a specific way to perform the payment.
 * 
 * Notice:
 * → It follows the Payment contract
 * → It can be replaced easily by another implementation
 */
public class PayPalPayment implements Payment {

    /**
     * Implementation of the pay method using PayPal.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Paid with PayPal: " + amount);
    }
}
