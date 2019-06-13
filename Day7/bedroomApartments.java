package Day7;

import java.util.Scanner;

public class bedroomApartments {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of bedrooms:");
		int bedrooms = scan.nextInt();
		if(bedrooms <=11)
		{
		int rent = bedrooms*3000;
		
		System.out.println("Rent for " +bedrooms +" is " +rent +" dollars");
		}
		else
		{
			System.out.println("Sorry we don't have " +bedrooms +"apartment units");
		}
	}

}
