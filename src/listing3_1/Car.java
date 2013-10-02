package listing3_1;

public class Car extends Vehicle {
	private int numWheels;
	
	public Car(String make, String model, int year, int numWheels) {
		super(make, model, year);
		this.numWheels = numWheels;
	}
	
	public int getNumWheels() {
		return numWheels;
	}

	public static void main(String[] args) {
		Car car = new Car("Ford", "Fiesta", 2009, 4);
		System.out.println("Make = " + car.getMake());
		System.out.println("Model = " + car.getModel());
		System.out.println("Year = " + car.getYear());
		System.out.println("Number of wheels = " + car.getNumWheels());
	}
}
