package DayApr13;

import java.util.*;

public class forEachPractice {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a sentence: ");
	String str=scan.nextLine();
	System.out.println(str);
	String[] words=str.split(" ");
	for(String eachItem:words)
	{
		System.out.println(eachItem);
	}
}
}	
//	int nums[]= {1,33,44,678,23};
//	
//	for(int eachItem:nums)
//	{
//		System.out.println(eachItem);
//	}

