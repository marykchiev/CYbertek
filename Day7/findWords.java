package Day7;

import java.util.Scanner;

public class findWords {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in a sentence:");
		String s=scan.nextLine();
		int count =s.length()-1;
		int space = 0;
		int nextSpace =0;
		String nextWord=" ";
		String firstWord = s.substring(0, s.indexOf(" "));
		System.out.println("First word is \"" +firstWord +"\"");
		
		for(int i =space; i<=count; i=space+1)
		{
			while(nextSpace!=-1)
			{
			space=s.indexOf(" ", i+1);
			nextSpace = s.indexOf(" ", space+1);
			
			System.out.println("Next word is \""+s.substring(space+1, nextSpace)+"\"");
			
		}
		}
		
		
		
		
		
		
	}

}
