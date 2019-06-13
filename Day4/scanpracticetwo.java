package Day4;

import java.util.Scanner;

public class scanpracticetwo {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		/*System.out.println("Enter your name: ");
		String name = input.next();
		System.out.println("Your name is: " +name); 
			
		//System.out.println("Enter your age: ");
		//int age = input.nextInt();
		
		System.out.println("Enter your birth year: ");
		int birthYear = input.nextInt();
		System.out.println("Your birth year is: " +birthYear);
		
		int age = 2019 - birthYear;
		
		
		System.out.println("Your Age is: " +age);
		
		System.out.println("Enter your monthly wage: ");
		Double wage = input.nextDouble();
		System.out.println("Your Annual salary is: " +(12*wage));
		*/
		
		System.out.println("Are you hungry:");
		String isHungry = input.next();
		
		if(isHungry.equals("yes"))
		{
		System.out.println("Go eat dinner");
		}
		else
		{
		System.out.println("Let's continue coding");
		
		}
	}
}
