package Day22;

import java.util.Scanner;

public class newSubstring {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String s=scan.next();
		
		int a=s.length()-1;
		for(int i=0;i<=a;i++)
		{
			System.out.print(s.substring(i,i+1)+"-");
		}
	}

}
