package Day7;

import java.util.Scanner;

public class daysOfTheWeek {
	public static void main(String[] args) {
		while(1==1)	
		{
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter number between 1-7");
		int dayNum = scan.nextInt();

		String wordDay;

		switch (dayNum) {
		case 1:
			wordDay = "Monday";
			break;
		case 2:
			wordDay = "Tuesday";
			break;
		case 3:
			wordDay = "Wednesday";
			break;
		case 4:
			wordDay = "Thursday";
			break;
		case 5:
			wordDay = "Friday";
			break;
		case 6:
			wordDay = "Saturday";
			break;
		case 7:
			wordDay = "Sunday";
			break;
		default:
			wordDay = "Invalid Entry!!!";
			break;

		}
		System.out.println(wordDay);

	}
	}
}
