package Day7;
import java.util.Scanner;

public class fizzbuzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Welcome Amazon shopper!");
		System.out.println("Please enter number:");
		int num = scan.nextInt();
		if(num%5==0 && num%3 !=0)
		{
			System.out.println("Fizz");
		}
		else if(num%3==0 && num%5!=0)
		{
			System.out.println("Buzz");
		}
		else if(num%5==0 && num%3==0)
		{
		System.out.println("Fizz Buzz");
	}
		else
		{
			System.out.println("Fizzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		}
		
	}

}
