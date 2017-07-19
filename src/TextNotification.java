/**
 * Created by David Turk on 7/19/17.
 */
public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        sayHello();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println("The recipient is " + this.getRecipient());
        System.out.println("The provider is " + this.getSmsProvider());
        System.out.println("The subject is " + super.getSubject());
        System.out.println("The body is " + super.getBody());
        System.out.println("This was created at " + super.getCreatedAt());
    }
}
