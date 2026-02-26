public class Main {
	public static void main(String[] args) {
		Car car = new Car("Terminator", "T-800", 1984, 6400000, 4);
		System.out.printf("The %s model %s from %d, has a cost of USD $%.2f and it has %d doors.", car.getBrand(), car.getModel(), car.getYear(),
				car.calculate_final_price(car.getBase_Price()), car.getDoors());
		Motorcycle motorcycle = new Motorcycle("Predator", "Jungle-Hunter", 1987, 15000000, 1000);
		System.out.printf("\nThe %s model %s from %d, has a cost of USD $%.2f and the engine displacement is %d cc.", motorcycle.getBrand(),
				motorcycle.getModel(), motorcycle.getYear(), motorcycle.calculate_final_price(motorcycle.getBase_Price()),
				motorcycle.getEngine_Displacement());
	}
}