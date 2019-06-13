package Day7;

import java.util.Scanner;

public class taskOne {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter command:");
		String apple = scan.next();
		
		switch(apple.charAt(0)) {
		case 'y':
			System.out.println("Your request is being processed");
			break;
		default:
			System.out.println("Invalid entry!");
			break;
		case 'n':
			System.out.println("Thank you anyway for your consideration");
			break;
		case 'h':
			System.out.println("Sorry, no help is currently available");
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
		
//		switch(apple.charAt(0)) {
//		case 'y':
//			System.out.println("Your request is being processed");
//			break;
//		case 'n':
//			System.out.println("Thank you anyway for your consideration");
//			break;
//		case 'h':
//			System.out.println("Sorry, no help is currently available");
//			break;	
//		default:
//			System.out.println("Invalid entry, please try again!");
//			break;
//		}
	}
	

}
