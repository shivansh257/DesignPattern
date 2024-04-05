package decorator;

public class Main {
    public static void main(String[] args) {
        Notification notifier = new FacebookDecorator(
                new WhatsappDecorator(
                        new Notifier("Shivansh")
                )
        );

        notifier.sendMessage("hello");
    }
}
