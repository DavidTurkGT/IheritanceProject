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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        return (recipient != null ? recipient.equals(that.recipient) : that.recipient == null) && (smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null);
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new EmailNotification(getSubject(), getBody(), recipient, smtpProvider);
    }
}
