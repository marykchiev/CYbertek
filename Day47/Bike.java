package Day47;

public class Bike {
private String brand;
private int gear;
private int speed;
private int id;
private static int countOfBike;

private Bike() {
	System.out.println("no arg constructor is being called");
}

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getGear() {
	return gear;
}
public void setGear(int gear) {
	this.gear = gear;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getId() {
	return id;
}

public static int getCountOfBike() {
	return countOfBike;
}
public Bike(String brand, int gear, int speed) {
	
	this.brand = brand;
	this.gear = gear;
	this.speed = speed;
	++countOfBike;
	this.id=countOfBike;
}

public String toString() {
	return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
}

public void speedUp(int increaseBy) {
	speed=speed+increaseBy;
}

public void slowdown(int decreaseBy) {
	speed=speed-decreaseBy;
}
static void showCurrentCount() {
	System.out.println("count is: "+countOfBike);
}

public static void resetCount() {
	countOfBike=0;
}
}
