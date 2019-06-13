package Day47;

import java.util.ArrayList;
import java.util.Arrays;

public class Marathon {

	public static void main(String[] args) {
		Bike b1=new Bike("Pinarello",5,100);
		Bike b2=new Bike("BMC",7,120);
		Bike b3=new Bike("GT Bicycles",6,110);
		Bike b4=new Bike("Giant Bicycles",4,90);
		Bike b5=new Bike("Trek Bicycle",5,80);
		
		
		ArrayList<Bike> lst1=new ArrayList<>(Arrays.asList(b1,b2,b3,b4,b5));
		//ArrayList<Bike> lst1=new ArrayList<>();
//		lst1.add(b1);
//		lst1.add(b2);
//		lst1.add(b3);
//		lst1.add(b4);
//		lst1.add(b5);
		for(Bike each:lst1) {
			System.out.println(each);
		}
		System.out.println("--------------------------------------------");
		
		for(Bike each:lst1) {
			each.speedUp(20);
			System.out.println(each);
		}
		System.out.println("--------------------------------------------");
		for(Bike each:lst1) {
			each.slowdown(40);
			System.out.println(each);
		}
		
		Bike.showCurrentCount();
		
		Bike.resetCount();
		Bike.showCurrentCount();
		
		Bike b6=new Bike("Yamaha",5,80);
		lst1.add(b6);
		for(Bike each:lst1) {
			System.out.println(each);
		}
		
		

	}

}
