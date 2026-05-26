package di;

/**
 * MarketingService handles promotions and campaigns.
 */
public class MarketingService {

    private Notification notification;

    public MarketingService(Notification notification) {
        this.notification = notification;
    }

    public void sendPromotion(String campaignName) {
        notification.send("New promotion campaign: " + campaignName);
    }
}
