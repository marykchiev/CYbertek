package Day7;

import java.util.Scanner;

public class nameScan {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter my name: ");
		String name = input.next();
		
		boolean b = name.contentEquals("Maksatbek");
		if (b == true)
		{
			System.out.println("That is my name");
		}
		else
		{
			System.out.println("That is not my name");
		}
		
	}

}
