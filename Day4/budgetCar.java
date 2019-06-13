package Day4;

import java.util.Scanner;

public class budgetCar {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What kind of car are you looking for: ");
		String Car = input.next();
		
		System.out.println("What year " +Car +" are you looking for");
		int carYear = input.nextInt();
		
		System.out.println("How much " +carYear +" "+Car +" cost");
		int num1 = input.nextInt();
		
		System.out.println("How much money do you have ");
		int num2 = input.nextInt();
		
		boolean isGreater = num2 > num1;
		if(isGreater == true)
		{
		System.out.println("You have enough money to buy "+carYear +" " +Car);
		}
		else
		{
		System.out.println("Unfortunately you don't have enough money to buy a "+carYear +" " +Car);
			
		}
		
	}

}
