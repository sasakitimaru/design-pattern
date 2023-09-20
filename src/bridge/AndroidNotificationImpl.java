package bridge;

public class AndroidNotificationImpl extends NotificationImpl {
    @Override
    protected void sendMessage(String to) {
        System.out.println("Send message to \"" + to + "@gmail.com\"");
        System.out.println(this.message);
    }
}
