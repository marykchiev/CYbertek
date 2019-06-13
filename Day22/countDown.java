package Day22;

import java.util.Scanner;

public class countDown {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int n=scan.nextInt();
		countFrom1ToN(n);
	}
public static void countFrom1ToN(int n) {
	for(int i=n;i>0;i--)
	{
		System.out.print(i+" ");
	}
}

}
