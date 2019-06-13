package Day7;

import java.util.Scanner;

public class vending {
	public static void main(String[] args) {
		
		
		    
		    Scanner scan = new Scanner(System.in);
		    
		

		   
		       
		       System.out.println("Split:");
		       String split = scan.nextLine();
		       
		       System.out.println("Number of people:");
		       int numPeople = scan.nextInt();
		       
		       System.out.println("Check amount:");
		       double checkAmount = scan.nextDouble();
		         System.out.println("Service Quality:");
		       String serviceQ="month";
		       System.out.println("Service Quality:");
		       serviceQ = scan.nextLine();
		       scan.next();
		       double tip=0.0;
		       switch(serviceQ.toLowerCase()){
		          case "poor":
		           tip =(0.05*checkAmount);
		           break;
		          case "fair":
		           tip =(checkAmount*0.1);
		           break;
		          case "good":
		           tip =(checkAmount*0.15);
		           break; 
		          case "great":
		           tip = (checkAmount*0.2);
		           break;
		          case "Excellent":
		           tip =(checkAmount*0.25);
		           break; 
		       }
		       System.out.println(tip);
		      }
		    }
		    
//		    int seniorCitizens;
//		    int nonSeniorCitizens;
//		    
//		    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
//		    
//		    seniorCitizens = input.nextInt();
//		    nonSeniorCitizens = input.nextInt();
//		    
//		    System.out.println("What is new citizen's age?");
//		    int age = input.nextInt();
//		    
//		    if( age >= 65){
//		      System.out.println("Senior Citizen");
//		      seniorCitizens = seniorCitizens+1;
//		      
//		    }else{
//		      nonSeniorCitizens=nonSeniorCitizens+1;
//		      System.out.println("Non-Senior Citizen");
//		    }
//		      System.out.println("New seniorCitizens" +seniorCitizens);
//		      System.out.println("New nonSeniorCitizens" + nonSeniorCitizens);
//	}
//}
	
//	int  itemPrice ,cents , quarters,dimes,nickels;
//	Scanner scan = new Scanner(System.in);
//    System.out.println("Enter price in cents:");
//    itemPrice = scan.nextInt();
//    cents = 100-itemPrice;
//    
//   if( (itemPrice>100 || itemPrice<25) && itemPrice%5!=0) {
//	        System.out.println("Invalid price!");
//   }
//   else
//   {
//    quarters = cents/25;  
//   // cents%=25; 
//    dimes = cents%25/10;
//   // cents%=10; 
//    nickels = cents%25%10/5;
//
//    System.out.println("Your change is " + quarters +" quarters, "+dimes+" dimes, and "+nickels+ " nickels.");
//   }
	//}
