package di;

/**
 * AccountService handles user account operations.
 */
public class AccountService {

    private Notification notification;

    public AccountService(Notification notification) {
        this.notification = notification;
    }

    public void createAccount(String username) {
        notification.send("Account created for user: " + username);
    }
}
