package Day22;

import java.util.Scanner;

public class mentoringSession {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int prize=0;
		int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();
	    int d = scan.nextInt();
	    
	    if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
	    	System.out.println("0");
	    else if(a==b && b==c && c==d)
	    	System.out.println("30");
	    	else if((a==b&&b==c)||(b==c&&c==d)||(a==c&&c==d))
	    		System.out.println("20");
	    	else if(a==b || a==c||a==d||b==c||b==d||c==d)
		    	System.out.println("10");
	}

}
