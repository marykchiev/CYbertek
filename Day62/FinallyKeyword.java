package Day62;

public class FinallyKeyword {
	
	public static void main(String[] args) {
	    
	    
	    // Objective:  run certain code whether the exception occured or not 
	    System.out.println("START ");
	    try {  
	      System.out.println("Try block ");
	      throw new RuntimeException(); 
	      
	    }catch (Exception e) {
	      System.out.println( "caught" );
	      
	    } finally {
	      System.out.println( "This code run no matter we have exception or not" );
	    }

	    System.out.println("End ");
	    
	    

	  }


}
