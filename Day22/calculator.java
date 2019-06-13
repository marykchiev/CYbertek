package Day22;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter operation: ");
		String operation=scan.next();
		System.out.println("Enter number1: ");
		int a=scan.nextInt();
		System.out.println("Enter number2: ");
		int b=scan.nextInt();
		
		
		calculate(operation, a,b);

	}
public static void calculate(String s, int a, int b) {
	if(s.equals("+"))
		System.out.println("Result of addition is: "+(a+b));
	else if(s.equals("-"))
		System.out.println("Result of subtruction is: "+(a-b));
	else if(s.equals("*"))
		System.out.println("Result of multiplication is: "+(a*b));
	else if(s.equals("/"))
		System.out.println("Result of division is: "+(a/b));
	else if(s.equals("%"))
		System.out.println("Result of mod is: "+(a%b));
}
}
