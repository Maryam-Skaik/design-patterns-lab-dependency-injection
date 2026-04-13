package di;

/**
 * FakePayment is used for testing purposes.
 * 
 * Instead of calling a real payment system, it simulates the behavior.
 * 
 * This is one of the biggest advantages of Dependency Injection:
 * → We can replace real dependencies with fake ones for testing
 */
public class FakePayment implements Payment {

    /**
     * Fake implementation (used in testing only).
     */
    @Override
    public void pay(double amount) {
        System.out.println("Fake payment for testing: " + amount);
    }
}
