package bridge;

public class Notification {
    private NotificationImpl impl;

    public Notification(NotificationImpl impl) {
        this.impl = impl;
    }

    protected void setMessage(String title, String message) {
        impl.setMessage(title, message);
    }

    protected void sendMessage(String to) {
        impl.sendMessage(to);
    }

    public final void Notify(String title, String message, String to) {
        setMessage(title, message);
        sendMessage(to);
    }
}
