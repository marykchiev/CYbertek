package Day22;

import java.util.Scanner;

public class toFind {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String toFind=scan.next();
		int a=str.length()-1;
		int b=toFind.length()-1;
		int count=0;
		for(int i=0; i<=a-b;i++)
		{
		  if(str.substring(i,i+b)==(toFind))
		  {
		    count=count-1;
		  }
		}
		System.out.println(count);
	}

}
