package Day4;

import java.util.Scanner;

public class muratCode {
	public static void main(String[] args){
		  Scanner input = new Scanner(System.in);
		  
			int areaCode = input.nextInt();
			int localNumber = input.nextInt();
			
			String phoneNumber ="(" +areaCode +")-" +localNumber;
			
			System.out.println("Calling number " +phoneNumber);
			
		  }
		  
	
  }


