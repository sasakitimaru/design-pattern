package bridge;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification(new iPhoneNotificationImpl());
        notification.Notify("Hello", "This is a message for iPhone", "John");
        notification = new Notification(new AndroidNotificationImpl());
        notification.Notify("Hello", "This is a message for Android", "Mary");
        MultiNotification multiNotification = new MultiNotification(new iPhoneNotificationImpl());
        multiNotification.MultiNotify("Hello", "This is a message for iPhone", new String[] {"Kurimatsu", "Steve"});
        multiNotification = new MultiNotification(new AndroidNotificationImpl());
        multiNotification.MultiNotify("Hello", "This is a message for Android", new String[] {"Tom", "Jerry"});
    }
}
