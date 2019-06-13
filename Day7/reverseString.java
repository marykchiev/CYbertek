package Day7;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter seconds:");
		int seconds=scan.nextInt();
		
		int hours=seconds/3600;
		int minutes=seconds/3600%60;
		int second=seconds%60%60;
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(second);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		 Scanner s = new Scanner(System.in);
//		    
//		    
//		    int house = s.nextInt();
//		    int player = s.nextInt();
		    
//		    1) if the card total is bigger then 21 the player busts.
//		    2)if the house score is bigger then the player, the player loses .
//		    3)if the player score is equal to the house then thers a draw.
//		    4)if the player score is bigger then the house the player wins.
//		    if((house+player)>21)
//		    	System.out.println("burst");
//		    else if(house>player)
//		    	System.out.println("player lost");
//		    else if(player==house)
//		    	System.out.println("draw");
//		    else if(player>house)
//		    	System.out.println("player win");
		
		
		
		
		
		
		
		
		
		
		
		
//			    Scanner scan = new Scanner(System.in);
//			    String email = scan.next();
//			    String name = "";
//			    String last="";
//			    String domain="";
//			    String com = "";
//			    
//			    int a =email.indexOf("_");
//			    int b=email.indexOf("@");
//			    int c = email.indexOf(".");
//			    
//			    name = email.substring(0,a);
//			    name=name.substring(0,1).toUpperCase()+name.substring(1);
//			    
//			    System.out.println("First name: " +name);
//			    last = email.substring(a+1,b);
//			    last=last.substring(0,1).toUpperCase()+last.substring(1);
//			    
//			    System.out.println("Last name: " +last);
//			    domain=email.substring(b+1,c);
//			    System.out.println("Domain: "+domain);
//			    com = email.substring(c+1);
//			    System.out.println("Top-Level Domain: "+com);
//			    
			    //Write a program that will print out information about user based on email. Print first and last name from the upper case.
//			    Example:
//			    	Input: craig_federighi@apple.com
//			    	Output: 
//			    	First name: Craig
//			    	Last name: Federighi
//			    	Domain: apple
//			    	Top-Level Domain: com

//	
//	    Scanner scan = new Scanner(System.in);
//	    String start = scan.next();
//	    String end = scan.next();
//	    String output="";
//	    
//	    if(start.equalsIgnoreCase("A"))
//	    {
//	    	if(end.equalsIgnoreCase("A"))
//	    		System.out.println("A found");
//	    	else if(end.equalsIgnoreCase("B"))
//	    		System.out.println("right: B found");
//	    	else if(end.equalsIgnoreCase("C"))
//	    		System.out.println("right > down: C found");
//	    	else if(end.equalsIgnoreCase("D"))
//	    		System.out.println("right > down > left: D found");
//	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    if(start.equalsIgnoreCase("A"))
//	    {
//	    	if(end.equalsIgnoreCase("A"))
//	    		System.out.println("A found");
//	    	else if(end.equalsIgnoreCase("B"))
//	    		System.out.println("right: B found");
//	    	else if(end.equalsIgnoreCase("C"))
//	    		System.out.println("right > down: C found");
//	    	else if(end.equalsIgnoreCase("D"))
//	    		System.out.println("right > down > left: D found");
//	    }
	    
	}
}
	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	    
//	
////	public static void main(String[] args) {
////		
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Enter sentence:");
////		
////		String sentence = scan.nextLine();
////		
////		int a = sentence.length()-1;
////		
////		while(a>=0)
////		{
////			System.out.print(sentence.charAt(a));
////			--a;
////		}
//		
//	}
//
//}
