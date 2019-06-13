package Day7;

import java.util.Scanner;

public class weekDays {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int weekDay = scan.nextInt();
		String dayName =" ";
		
		switch(weekDay) {
		case 1:
			dayName ="Monday";
			System.out.println(dayName);
		case 2:
			dayName ="Tuesday";
			System.out.println(dayName);
		case 3:
			dayName ="Wednesday";
			System.out.println(dayName);
			break;	
		case 4:
			dayName ="Thursday";
			System.out.println(dayName);
		case 5:
			dayName ="Friday";
			System.out.println(dayName);
			break;
		case 6:
			dayName ="Saturday";
			break;
		case 7:
			dayName ="Sunday";
			break;
		default:
		System.out.println("Invalid Number");
		break;
		}
		//System.out.println(dayName);
	}

}
