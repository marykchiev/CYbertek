package Day4;

import java.util.Scanner;

public class compareTwo {
	public static void main(String[] args) {
		
		/*int a=10, b=10;
		if(a==b)
		{
		
		System.out.println("yes a is equal to b");
		}
		else
		{
		System.out.println("no a is not equal to b");	
		}
		System.out.println("is a equal to b " +(a==b));
		System.out.println("is a bigger than b " +(a>b));
		System.out.println("is a less than b " +(a<b));
		System.out.println("is a not equal to b " +(a!=b));
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		int num1 = input.nextInt();
		
		System.out.println("Please enter number 2: ");
		int num2 = input.nextInt();
		
		boolean isGreater = num1 > num2;
		System.out.println("is num1 greater than num2: " +isGreater);
		
	}

}
