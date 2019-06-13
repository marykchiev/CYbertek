package Day22;

import java.util.Scanner;

public class day30Task2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int n=scan.nextInt();
		countFrom1ToN(n);
	}
public static void countFrom1ToN(int n) {
	for(int i=0;i<n;i++)
	{
		System.out.print(i+1+" ");
	}
}


}
