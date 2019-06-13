package Day43;

public class Vehicle {

	  private String make;
	  private int speed;
	  private String model;

	  public void increaseSpeed(int increaseBy) {

	    // speed = speed + increaseBy;
	    for (int i = 1; i <= increaseBy; i++) {

	      speed++ ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	  }
	  
	  public void decreaseSpeed(int decreaseBy) {
	    
	    for (int i = 1; i <= decreaseBy; i++) {

	      speed-- ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	    
	  }

	  public String getModel() {
	    return model;
	  }

	  public void setModel(String model) {
	    this.model = model;
	  }

	  public String getMake() {
	    return make;
	  }

	  public void setMake(String make) {
	    this.make = make;
	  }

	  public int getSpeed() {
	    return speed;
	  }

	  public void setSpeed(int speed) {
	    this.speed = speed;
	  }
	  public void stop() {
//		  speed=0;
//		  setSpeed(0);
//		  this.speed=0;
//		  this.setSpeed(0);
		  decreaseSpeed(speed);
	  }

	}