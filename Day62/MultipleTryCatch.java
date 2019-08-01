package Day62;

public class MultipleTryCatch {
public static void main(String[] args) {
	System.out.println("start");
	String str="Abc";
	int num1=10;
	int num2=0;
	try {
		System.out.println("try start");
		System.out.println(str.charAt(1));
		System.out.println(num1/num2);
		System.out.println("end");
	}catch(StringIndexOutOfBoundsException ex1) {
		System.out.println("doesn't have that index");
	}catch(ArithmeticException ex2) {
		System.out.println("do not divide by 0");
	}
}
}
