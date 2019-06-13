package Day39;

public class Car {
	String made;
	String model;
	String color;
	int year;
	double price;
	short horsePower;
	
	public static void main(String[] args) {
		Car c1=new Car();
		
		c1.made="Toyota";
		c1.model="Highlander";
		c1.color="White";
		c1.year=2019;
		c1.price=60000;
		c1.horsePower=200;
		
		System.out.println(c1.model);
	}
	
}
