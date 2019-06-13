package Day4;

import java.util.Scanner;


public class scannePractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter your mood today:");
		
		String mood = input.next();
		System.out.println("Enter your location today: ");
		String location = input.next();
		
		System.out.println("Your mood today is: " +mood);
		System.out.println("Your location is: " +location);
		
	}

}
