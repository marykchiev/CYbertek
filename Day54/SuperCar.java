package Day54;

public class SuperCar {

	final String model;
	final String make;
	final Engine engine;
	
	public SuperCar(String model, String make, Engine engine) {
		this.model=model;
		this.make=make;
		this.engine=engine;
	}

	
	public String toString() {
		return "SuperCar [model=" + model + ", make=" + make + ", engine=" + engine + "]";
	}
	
	public void start() {
	engine.start();
	}
	
	public static void main(String[] args) {
		Engine e1= new Engine("Turbo", 8);
		System.out.println(e1.cylinderCount);
		
		
	}
	
	
	
	
	
	
}
