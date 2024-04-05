package decorator.nonDecorator;

import decorator.Notifier;

public class FacebookNotifier extends Notifier {
    public FacebookNotifier(String username) {
        super(username);
    }

    @Override
    public void sendMessage(String message) {
        String fbUsername = databaseService.getFBUsernameFromUsername(getUsername());
        System.out.println("Sending " + message + " by facebook to "+ fbUsername);
    }
}
