public class Motorcycle extends Vehicle {
	// Attributes.
	private int engine_displacement;
	
	// Construct.
	public Motorcycle(String brand, String model, int year, double base_price, int engine_displacement) {
		super(brand, model, year, base_price);
		this.engine_displacement = engine_displacement;
	}
	
	// Getters & Setters.
	public void setEngine_Displacement(int engine_displacement) {
		this.engine_displacement = engine_displacement;
	}
	public int getEngine_Displacement() {
		return engine_displacement;
	}
	
	// Methods.
	@Override
	public double calculate_final_price(double base_price) {
		return base_price + 10000;
	}
}