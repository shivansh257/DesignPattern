package decorator;

public abstract class BaseDecorator implements Notification {
    protected final Notification notification;  // wrapped object
    protected final DatabaseService databaseService;

    public BaseDecorator(Notification notification) {
        this.notification = notification;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void sendMessage(final String message) {
        notification.sendMessage(message);
    }

    @Override
    public String getUsername() {
        return notification.getUsername();
    }
}
