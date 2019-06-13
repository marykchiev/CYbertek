package Day7;

import java.util.Scanner;

public class statementSwitch {
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter weather:");
		String weather = scan.nextLine();
		
		switch(weather) {
		case "sunny":
			System.out.println("go out");
			break;
		case "cloudy":
			System.out.println("umbrella");
			break;
		case "windy":
			System.out.println("wear jacket");
			break;
		case "snowy":
			System.out.println("snowboard");
			break;
		case "stormy":
			System.out.println("stay home");
			break;
		case "shiny":
			System.out.println("beach");
			break;	
		default:
			System.out.println("coding coding coding");
		
		}
	}

}
