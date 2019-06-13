package Day7;

import java.util.Scanner;

public class loginSecond {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		long accountNumber = 128394058679098L;
		String password = "ju2i389d";
		
		System.out.println("Welcome to Cybertek Banking App");
		System.out.println("Please enter account number and password: ");
		long userAccNum = input.nextLong();
		String userPassw = input.next();
		
		if((userAccNum == accountNumber) && userPassw.contentEquals(password))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login failed");
		}
		}
	}
