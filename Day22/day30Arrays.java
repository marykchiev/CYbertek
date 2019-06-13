package Day22;

import java.util.Scanner;

public class day30Arrays {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int n=scan.nextInt();
		countFrom1To10();
		countFrom1ToN(n);
		countDown(n);
	}

	public static void countFrom1To10() {
		for(int i=0;i<10;i++)
		{
			System.out.print(i+1+" ");
		}
		System.out.println();
	}
	public static void countFrom1ToN(int n) {
		for(int i=0;i<n;i++)
		{
			System.out.print(i+1+" ");
		}
		System.out.println();
	}
	public static void countDown(int n) {
		for(int i=n;i>0;i--)
		{
			System.out.print(i+" ");
		}
	}
}
