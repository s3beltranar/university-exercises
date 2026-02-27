public class Hardware_Report extends Report {
	// Attributes.
	private String hardware_type;
	private String ubication;
	
	// Construct.
	public Hardware_Report(String code, String description, String author, int priority, boolean solved, String hardware_type, 
			String ubication) {
		super(code, description, author, priority, solved);
		this.hardware_type = hardware_type;
		this.ubication = ubication;
	}
	
	// Setters & Getters.
	public void setHardware_Type(String hardware_type) {
		this.hardware_type = hardware_type;
	}
	public String getHardware_Type() {
		return hardware_type;
	}
	public void setUbication(String ubication) {
		this.ubication = ubication;
	}
	public String getUbication() {
		return ubication;
	}
	
	// Methods.
	@Override
	public void Generate_Report() {
		System.out.println("\n\n- GENERATING HARDWARE REPORT -\n ...");
		System.out.printf("Hardware: %s\nUbication: %s\nDescription: %s\n", hardware_type, ubication, getDescription());
	}
}