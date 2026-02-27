public class Software_Report extends Report {
	// Attributes.
	private String language;
	private String system_version;
	
	// Construct.
	public Software_Report(String code, String description, String author, int priority, boolean solved, String language, 
			String system_version) {
		super(code, description, author, priority, solved);
		this.language = language;
		this.system_version = system_version;
	}
	
	// Setters & Getters.
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLanguage() {
		return language;
	}
	public void setSystem_Version(String system_version) {
		this.system_version = system_version;
	}
	public String getSystem_Version() {
		return system_version;
	}
	
	// Methods.
	@Override
	public void Generate_Report() {
		System.out.println("- GENERATING SOFTWARE REPORT -\n ...");
		System.out.printf("Language: %s\nVersion: %s\nDescription: %s\n", language, system_version, getDescription());
	}
}