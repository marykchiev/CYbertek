package DayApr13;

import java.util.Arrays;

public class sentenceReverse {
	public static void main(String[] args) {
		
		String str="Sunday Perfect Day to start coding";
		
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		
		String[] words=str.split(" ");
		String revWord="";
		for(int j=0;j<words.length/2;j++)
		{	revWord=words[j];
			String temp=words[j];
			words[j]=words[words.length-1-j];
			words[words.length-1-j]=temp;		
		}
		System.out.println(Arrays.toString(words));
	}

}
