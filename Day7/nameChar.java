package Day7;

import java.util.Scanner;

public class nameChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Slack!"
				+"\n Enter your name");
		String name = scan.next();
		
		int nameLenght = name.length();
		
		if (nameLenght >22)
		{
			System.out.println("Slack cannot take more than 22 characters");
		nameLenght = 21;
		System.out.println("user name has been adjusted");
	}
		System.out.println("Successfully added user");
		
		
		
	}

}
