package OCA;

public class Car {
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	int price;
	
	public Car(String make, String model, int numberOfDoors, int topSpeed, int price) {
		//super();
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	public Car(String make, String model, int topSpeed, int price) {
		//super();
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;
		numberOfDoors=4;
	}
	public Car(int numberOfDoors, int topSpeed, int price) {
		super();
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
		make="unknown";
		model="unknown";
	}
	public Car(String make, String model, int numberOfDoors) {
		super();
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		topSpeed=90;
		price=0;
	}
	
	
	

}
