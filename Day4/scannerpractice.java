package Day4;

import java.util.Scanner;

public class scannerpractice {
	public static void main(String[] args) {
		//create a scanner object
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your name please: ");
		String name = userInput.next();
		System.out.println(name +"How much salary you want to get in this job: ");
		String salary = userInput.next();
		System.out.println("You will be the best SDET in the future " +name + " but you are asking too much");
		
	}

}
