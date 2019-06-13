package Day7;

import java.util.Scanner;

public class nameCompare {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter full name:");
	 String name = scan.nextLine();

	String name1 ="Max Panye";
	String name2 = "Alan Wake";


	if(name.equalsIgnoreCase(name1) || name.equalsIgnoreCase(name2)){
	System.out.println("User found!");
	 }else {
	System.out.println("User not found!");
	 }
	}
}
