package Day7;

import java.util.Scanner;

public class enterName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String s=scan.next();

		if((s.charAt(0)=='A') && (s.charAt(s.length()-1)=='x'))
		{
			System.out.println("Name start with letter A and ends with x");
			int a = s.indexOf('a',1);
			System.out.println(a);
		}
		else
		{
			System.out.println("Name start with different letter");
			int a = s.indexOf('a',1);
			System.out.println(a);
		}
		if(s.length()>=2)
		{
			if(s.length()%2==1)
			{
				
				System.out.println("Middle letter is \""+ (s.charAt(s.length()/2))+"\"");
			}
			else
			{
				System.out.println("Middle two letters are \""+(s.charAt(s.length()/2-1))+" "+(s.charAt(s.length()/2))+"\"");
			}
		}

		
	}

}
