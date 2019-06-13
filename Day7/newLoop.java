package Day7;

import java.util.Scanner;

public class newLoop {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
		    String name= "";
		    String lastName = "";
		    String domain = "";
		    String domainLevel = "";
		    
		      name = email.substring(0, email.indexOf("_"));
		      lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
		      domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
		      domainLevel = email.substring(email.indexOf(".")+1);
//		      System.out.println(name);
//		      System.out.println(lastName);
//		      System.out.println(domain);
//		      System.out.println(domainLevel);
		      
		      
		    name= email.substring(0,1).toUpperCase() + email.substring(1,email.indexOf("_"));
		      System.out.println(name);
		      lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
		      System.out.println(lastName);
//		    System.out.println( name + "\n" + lastName + "\n" + domain + "\n" + domainLevel);
		  }
		}
		

