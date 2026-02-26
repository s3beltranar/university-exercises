public class Car extends Vehicle {
	// Attributes.
	private int doors;
	
	// Construct.
	public Car(String brand, String model, int year, double base_price, int doors) {
		// We need to call super(...) to initialize all the parameters of the construct that extends from the Vehicle.java class.
		super(brand, model, year, base_price);
		this.doors = doors;
	}
	
	// Getters & Setters.
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getDoors() {
		return doors;
	}
	
	// Method.
	@Override
	public double calculate_final_price(double base_price) {
		return base_price + 20000;
	}
}