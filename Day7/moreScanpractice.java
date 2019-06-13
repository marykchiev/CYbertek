package Day7;

import java.util.Scanner;

public class moreScanpractice {
	public static void main(String[] args) {
		int x=3;
		x= x++ + --x + x-- +x;
		System.out.println(x);
			
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your name please: ");
	String name = scan.nextLine();
	
	System.out.println("Enter your company please: ");
	String company = scan.nextLine();
	
	System.out.println("Enter your age please: ");
	int age = scan.nextInt();
	scan.nextLine();
	
	System.out.println("Enter your Address please: ");
	String addressone = scan.nextLine();
	
	System.out.println("Hello fellow coder, your name is: " +name
			+"\n you currently work at: " +company
			+"\n & you are " +age +" years old"
			+"\n your address is "+addressone);
	

	
	
	
	/*
	
	
	
	
	
			*/
	
	}
		
	

}
