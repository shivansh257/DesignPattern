package decorator;

public class Notifier implements Notification {
    private final String username;

    protected final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void sendMessage(String message) {
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending " + message + " by mail to "+ mail);
    }

    public String getUsername() {
        return username;
    }
}

