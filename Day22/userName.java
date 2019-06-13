package Day22;

import java.util.Scanner;

public class userName {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter username: ");
		String userN=scan.next();
		System.out.println("Please enter password: ");
		String passWord=scan.next();
		System.out.println("remember UserName: ");
		Boolean RememberMe=scan.nextBoolean();
		
		login(userN, passWord, RememberMe);
		
	}
public static void login(String user, String pass, Boolean b) {
	System.out.println("your username is: " +user);
	System.out.println("your password is: "+pass);
	if(b==true)
		System.out.println("You checked remember me");
	else
		System.out.println("You did not check remeberMe checkbox");
}
}
