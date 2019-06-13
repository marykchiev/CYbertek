package Day7;

import java.util.Scanner;

public class logIn {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		String userName = "mkkdr88";
		String password = "ju2i389d";
		
		System.out.println("Please enter username and password: ");
		String userUser = input.next();
		String userPassword = input.next();
		if(userUser.contentEquals("admin"))
		{
			System.out.println("Login successful");
		}
		else
		{
		if(userUser.contentEquals(userName) && userPassword.contentEquals(password))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login failed");
		}
		}
	}
}
