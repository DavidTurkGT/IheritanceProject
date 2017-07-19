import java.time.LocalDateTime;

/**
 * Created by David Turk on 7/19/17.
 */
public abstract class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification (String subject, String body){
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "Protected";
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public abstract void transport();

    public void showStatus() {
        System.out.println("Status: " + this.status);
    }

    protected void sayHello(){
        System.out.println("The notification class says hello!");
    }
}
