package bridge;

public class iPhoneNotificationImpl extends NotificationImpl {
    @Override
    protected void sendMessage(String to) {
        System.out.println("Send message to \"" + to + "@icloud.com\"");
        System.out.println(this.message);
    }
}