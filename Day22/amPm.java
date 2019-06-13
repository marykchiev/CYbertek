package Day22;

import java.util.*;

public class amPm {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());
		  }
		  
		  public static void timeConversion(String s) {
		    String q="";
		    int newS=0;
		   if(s.substring(8,9).contains("A"))
		   {
		     System.out.println(s.substring(0,(s.length()-2)));
		   }
		  else if(s.substring(8,9).contains("P"))
		  {
		     q=s.substring(0,2);
		     newS=Integer.parseInt(q);
		     System.out.println(newS);
		     newS=newS+12;
		     q=newS+""+s.substring(3);
		     q=q.substring(0,q.length()-2);
		     System.out.println(q);
		  }
		
		  }
}
