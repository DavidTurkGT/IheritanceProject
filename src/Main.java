/**
 * Created by David Turk on 7/19/17.
 */
public class Main {
    public static void main(String[] args) {
        EmailNotification emailNote;
        emailNote = new EmailNotification("Email test", "This tests a new email note","Turk", "Google");
        emailNote.transport();
        emailNote.showStatus();

        TextNotification textNote;
        textNote = new TextNotification("Text test","This will test a new text note","TIY","Verizon");
        textNote.transport();
        textNote.showStatus();


        try {
            Object emailNotificationClone = emailNote.clone();
            System.out.println("Equal? ");
            System.out.println(emailNote.equals(emailNotificationClone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
