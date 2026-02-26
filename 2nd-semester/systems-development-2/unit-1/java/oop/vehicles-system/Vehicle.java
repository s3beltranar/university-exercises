public class Vehicle {
	// Attributes.
	private String brand;
	private String model;
	private int year;
	private double base_price;
	
	// Construct.
	public Vehicle(String brand, String model, int year, double base_price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.base_price = base_price;
	}
	
	// Setters & Getters.
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setYear(int year) {
		this.year = year;;
	}
	public int getYear() {
		return year;
	}
	public void setBase_Price(double base_price) {
		this.base_price = base_price;
	}
	public double getBase_Price() {
		return base_price;
	}
	
	// Methods.
	public double calculate_final_price(double base_price) {
		return base_price;
	}
}