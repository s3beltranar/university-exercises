public class Notification {
	// Attributes.
	private String addressee_name;
	private String message;
	private int priority;
	private boolean sent;
	
	// Construct.
	public Notification(String addressee_name, String message, int priority, boolean sent) {
		this.addressee_name = addressee_name;
		this.message = message;
		setPriority(priority);
		this.sent = sent;
	}
	
	// Setters & Getters.
	public void setAddressee_Name(String addressee_name) {
		this.addressee_name = addressee_name;
	}
	public String getAddressee_Name() {
		return addressee_name;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setPriority(int priority) {
		if (priority == 1) {
			this.priority = priority;
		} else if (priority == 2) {
			this.priority = priority;
		} else if(priority == 3) {
			this.priority = priority;
		} else {
			return;
		}
	}
	public int getPriority() {
		return priority;
	}
	public void setSent(boolean sent) {
		this.sent = sent;
	}
	public boolean getSent() {
		return sent;
	}
	
	// Methods.
	public void send() {
		sent = true;
		System.out.println("The message was succesfully sent!");
	}
	public void show_status() {
		System.out.printf("\nAdressee name: %s \nPriority: %d\nSent: %b", addressee_name, priority, sent);
	}
}