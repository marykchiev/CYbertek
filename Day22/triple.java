package Day22;

import java.util.Scanner;

public class triple {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int count=0;
		int a=str.length()-1;
		for(int i=0;i<=a-2;i++)
		{
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2))
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
