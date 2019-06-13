package Day7;

import java.util.Scanner;

public class reverseChar {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter word:");
		String word=scan.next();
		if (word.substring(0, 4).equalsIgnoreCase("java") ||
				word.substring(1, 5).equalsIgnoreCase("java")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
//		String newWord="";
//		int a=word.length()-1;
//		
//		while(a>=0)
//		{
//			newWord=newWord+ word.charAt(a);
//			--a;
//		}
//		System.out.println(newWord);
//		if(newWord.contains(word))
//		{System.out.println("palindrome");
//		}
//		else
//		{System.out.println("it is  not");
		
//		}
	}

}
