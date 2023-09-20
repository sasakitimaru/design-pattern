package bridge;

public class MultiNotification extends Notification {
    public MultiNotification(NotificationImpl impl) {
        super(impl);
    }

    public void MultiNotify(String title, String message, String[] to) {
        setMessage(title, message);
        for (String s : to) {
            sendMessage(s);
        }
    }
}
