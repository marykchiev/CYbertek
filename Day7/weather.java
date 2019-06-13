package Day7;

import java.util.Scanner;

public class weather {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter weather:");
		String weather = scan.nextLine();
		
		String whatToDo = (weather.equalsIgnoreCase("Sunny"))? "go out" : (weather.equalsIgnoreCase("Cloudy"))? "take your umbrella with you" : (weather.equalsIgnoreCase("windy"))? "wear your jacket" : "stay at home & watch Netflix";
	System.out.println(whatToDo);
	}
	

}
