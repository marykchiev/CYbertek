package Day7;

import java.util.Scanner;

public class charStrings {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two names");
		
		String name1 = scan.next();
		String name2=scan.next();
		
		if(name1.equalsIgnoreCase(name2))
		{
			System.out.println(" name1 is same as name2");
		}
		else
		{
			System.out.println("names are not same");
		}
		
		if(name1.length()==name2.length())
			System.out.println("name1 length equal to name2 length");
		else
			System.out.println("name1 and name2 length are not equal");
		if(name1.length()>name2.length())
		{
		System.out.println("Name1 is longer thatn name2");
		System.out.println(name1.charAt(1));
		}
		else
		{
			System.out.println("name2 is longer than name1");
			System.out.println(name2.charAt(2));
		}
		int lastChar=name1.length();
		int lastChar1 = lastChar-1;
		char apple = name1.charAt(lastChar1);
System.out.println(apple);
		
	}

}
