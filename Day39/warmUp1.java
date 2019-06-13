package Day39;

public class warmUp1 {
	
  String brand;
  float currentTemp;
  boolean isOn;
  
  public void displayBrand() {
    System.out.println("the brand is " + brand);
  }
  
  public void showCurrentTemp() {
    System.out.println("currentTemp :  " + currentTemp);
  }
  
  public void displayAllInfo() {
    System.out.println("Brand is "+brand+" | The current temp is "+currentTemp+" | Is AC on? "+isOn);
  }
  
  public void turnOn() {
    
    System.out.println("current AC is " + isOn);
    
    if(isOn == false) {
      isOn = true ; 
    }else {
      System.out.println("It is already on !!!");
    }
    
  }
  
  
  public void turnOff() {
    
    if(isOn) {
      isOn = false;
      System.out.println("It has been turned off");
    }else {
      System.out.println("IT IS ALREADY OFF!@");
    }
  }
  }