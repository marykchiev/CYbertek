package Day7;

import java.util.Scanner;

public class twoNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Math Library");
		System.out.println("Enter two integer numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int sumNum = num1+num2;
		
		if(sumNum >100)
		{
			System.out.println("You entered great numbers");
		}
		else
		{
			System.out.println("looks like your answer is less than 100");
		}
	}

}
