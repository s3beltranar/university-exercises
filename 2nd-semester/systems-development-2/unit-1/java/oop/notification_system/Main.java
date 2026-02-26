import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		// Implementation.
		ArrayList<Notification> notify = new ArrayList<Notification>();
		Email_Notification email = new Email_Notification("Pepe.", "Hi :D.", 3, false, "r1ch_kid@hotmail.com", "Greetings!");
		notify.add(email);
		SMS_Notification sms = new SMS_Notification("Bob.", "Hello Pepe.", 3, false, "5001234567");
		notify.add(sms);
		
		// We iterate through the list using for-earch.
		for(Notification n : notify) {
			n.send();
			n.show_status();
		}
	}
}