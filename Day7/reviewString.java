package Day7;

import java.util.Scanner;

public class reviewString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("");
		String myName = "Maksatbek";
		System.out.println(myName);
		int i=myName.length()-1;
		int x = myName.length();
		System.out.println(myName.charAt(i));
		System.out.print(myName.charAt(0));
		System.out.println(myName.charAt(1));
		int middle = myName.length()/2;
		System.out.println(myName.substring(middle, x));
		
		
	}

}
