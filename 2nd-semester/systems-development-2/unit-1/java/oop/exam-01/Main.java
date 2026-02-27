import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		// Implementation.
		ArrayList<Report> report = new ArrayList<Report>();
		Software_Report software_report = new Software_Report("R15", "Whamola.", "Les Claypool", 1, true, "English", "6.19.00");
		report.add(software_report);
		Hardware_Report hardware_report = new Hardware_Report("R13", "I want to be a Fisherman.", "Primus", 2, true, "Bass strings.", "Bay.");
		report.add(hardware_report);
		
		// For-each.
		for (Report n : report) {
			n.Generate_Report();
			n.Show_Status();
			System.out.println("\n\n\n--------------------------");
		}
	}
}