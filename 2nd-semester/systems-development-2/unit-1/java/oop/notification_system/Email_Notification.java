public class Email_Notification extends Notification {
	// Attributes.
	private String email;
	private String subject;
	
	// Construct.
	public Email_Notification(String addressee_name, String message, int priority, boolean sent, String email, String subject) {
		super(addressee_name, message, priority, sent);
		this.email = email;
		setSubject(subject);
	}
	
	// Setters & Getters.
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setSubject(String subject) {
		if (subject == null || subject == "") {
			System.out.println("ERROR.");
			return;
		}
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	
	// Methods.
	@Override
	public void send() {
		System.out.printf("Sending to: %s | Subject: %s | Message: %s", email, subject, getMessage());
		setSent(true);
	}
}