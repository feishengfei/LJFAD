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

	@Override
	void describe() {
		System.out.print("This car is a ");
		super.describe();
	}

	public static void main(String[] args) {
		Car car = new Car("Ford", "Fiesta", 2009, 4);
		car.describe();
	}
}
