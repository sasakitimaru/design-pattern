package bridge;

public abstract class NotificationImpl {
    protected StringBuilder message = new StringBuilder();
    protected void setMessage(String title, String message){
        this.message.append("Title: 【" + title + "】\n");
        this.message.append("----------------------------\n ");
        this.message.append(message + "\n");
        this.message.append("----------------------------\n ");
    }
    protected abstract void sendMessage(String to);
}
