package Day7;

import java.util.Scanner;

public class calculatorTradition {
	public static void main(String[] args) {

	while(1==1)	
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two number:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Please enter operator: +, -, *, /, %");
		String operator = scan.next();
		
		switch(operator.toLowerCase()) {
		case "-":
			System.out.println("the result is " +(num1-num2));
			break;
		case "+":
			System.out.println("the result is " +(num1+num2));
			break;
		case "*":
			System.out.println("the result is " +(num1*num2));
			break;
		case "/":
			System.out.println("the result is " +(num1/num2));
			break;
		case "%":
			System.out.println("the result is " +(num1%num2));
			break;
		default:
			System.out.println("that is not a correct operator. choose from list: -, +, *, /, %");
			break;
		}	
		}
	}

}
