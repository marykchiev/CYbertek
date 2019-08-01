package Day62;

import java.util.Scanner;

public class ExceptionPractice {
public static void main(String[] args) {
	System.out.println("Beginning");
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter string with two char");
	String str=scan.nextLine();
	try {
		System.out.println("try begin");
		System.out.println("your second char is: "+str.charAt(1));
		System.out.println("try end");
	}catch(StringIndexOutOfBoundsException siob) {
		System.out.println("Enter correct index");
	}
	
//	int[] nums= {1,5,6};
//	try {
//		
//		System.out.println(nums[99]);
//	}catch (ArrayIndexOutOfBoundsException e) {
//		System.out.println("enter valid index");
//	}
//	System.out.println("End");
	
	//System.out.println(nums[99]);
//	
//	ArrayIndexOutOfBoundsException aib= new ArrayIndexOutOfBoundsException();
//	System.out.println(aib);
	
//	System.out.println("Beginning");
//	
//	Scanner scan= new Scanner(System.in);
//	
//	try {
//		System.out.println("Enter num1 ");
//		int num1=scan.nextInt();
//		System.out.println("Enter num2 ");
//		int num2=scan.nextInt();
//		System.out.println(num1/num2);
//	}catch(ArithmeticException e) {
//		System.out.println("don't input 0 for num2");
//	}
//	System.out.println("End");
}
}
