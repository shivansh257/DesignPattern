package decorator.nonDecorator;

import decorator.Notifier;

public class WhatsappNotifier extends Notifier {
    public WhatsappNotifier(String username) {
        super(username);
    }

    @Override
    public void sendMessage(String message) {
        String phoneNo = databaseService.getPhoneNoFromUsername(getUsername());
        System.out.println("Sending " + message + " by whatsapp to "+ phoneNo);
    }
}
