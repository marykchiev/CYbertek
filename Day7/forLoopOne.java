package Day7;

import java.util.Scanner;

public class forLoopOne {
	public static void main(String[] args) {
		String name = "";
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enteryour name: ");
		name = scan.nextLine();
		int a=name.length()-1;
		int count=0;
		
		while(a>=0)
		{
			System.out.print(name.charAt(a));
			if(name.charAt(a)=='a')
			{
				count=count+1;
				
			}
			--a;
		}
		System.out.println("\n In your name you have: "+count +"a");
		
	}

}
