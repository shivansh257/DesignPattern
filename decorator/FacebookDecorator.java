package decorator;

public class FacebookDecorator extends BaseDecorator{
    public FacebookDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        String fbUsername = databaseService.getFBUsernameFromUsername(getUsername());
        System.out.println("Sending " + message + " by facebook to "+ fbUsername);
    }
}
