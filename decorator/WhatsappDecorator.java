package decorator;

public class WhatsappDecorator extends BaseDecorator {
    public WhatsappDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        String phoneNo = databaseService.getPhoneNoFromUsername(getUsername());
        System.out.println("Sending " + message + " by whatsapp to "+ phoneNo);
    }
}
