/**
 * Created by David Turk on 7/19/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        super.status = "Email override!";
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        sayHello();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println("The recipient is " + this.getRecipient());
        System.out.println("The provider is " + this.getSmtpProvider());
        System.out.println("The subject is " + this.getBody() );
        System.out.println("The body is " + this.getSubject() );
        System.out.println("This was created at " + this.getCreatedAt() );
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("The email class also says hello!");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
