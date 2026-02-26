public class SMS_Notification extends Notification {
	// Attributes.
	private String phone_number;
	
	// Construct.
	public SMS_Notification(String addressee_name, String message, int priority, boolean sent, String phone_number) {
		super(addressee_name, message, priority, sent);
		setPhone_Number(phone_number);
	}
	
	// Setters & Getters.
	public void setPhone_Number(String phone_number) {
		if (phone_number.length() == 10) {
			this.phone_number = phone_number;
		} else {
			return;
		}
	}
	public String getPhone_Number() {
		return phone_number;
	}
	
	// Methods.
	@Override
	public void send() {
		System.out.printf("\n\nSending SMS to: %s | Message: %s", phone_number, getMessage());
		setSent(true);
	}
}