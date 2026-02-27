public class Report {
	// Attributes.
	private String code;
	private String description;
	private String author;
	private int priority;
	private boolean solved;
	
	// Construct.
	public Report(String code, String description, String author, int priority, boolean solved) {
		this.code = code;
		this.description = description;
		this.author = author;
		setPriority(priority);
		this.solved = solved;
	}
	
	// Setters & Getters.
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setPriority(int priority) {
		if (priority < 1 || priority > 3) {
			return;
		} else {
			this.priority = priority;
		}
	}
	public int getPriority() {
		return priority;
	}
	public void setSolved(boolean solved) {
		this.solved = solved;
	}
	public boolean getSolved() {
		return solved;
	}
	
	// Methods.
	public void Generate_Report() {
		System.out.println("Generating general report: " + description);
	}
	public void Show_Status() {
		System.out.printf("Code: %s\nAuthor: %s\nPriority: %d\nSolved: %b", code, author, priority, solved);
	}
}