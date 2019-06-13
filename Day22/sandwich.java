package Day22;

import java.util.Scanner;

public class sandwich {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int a=str.length()-1;
		
		//xxbreadjambreadkjdjsdbread
		//xxbreadjambread
		int b=str.indexOf("bread");
		int c=str.indexOf("bread",b+4);
		int d=str.indexOf("bread",c+4);
		
		if(c<0)
			System.out.println("nothing");
		else if(d>1)
			System.out.println(str.substring(b+5,d));
		else if(c>1 && d==-1)
			System.out.println(str.substring(b+5,c));
		
		
	}

}
