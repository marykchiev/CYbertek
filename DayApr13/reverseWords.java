package DayApr13;

public class reverseWords {
	public static void main(String[] args) {
	
			    // TODO Auto-generated method stub
			    /*
			     * String str = "Cybertek Batch Spartan is most hardworking Batch ever";
			      ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 
			     * */
			    
			    
			    
			    String str = "Cybertek Batch Spartan is most hardworking Batch ever";
			    String[] words = str.split(" ");  
			    String reversedSentence = "";
			    
			    for (int j = 0; j < words.length; j++) {
			      //System.out.println(words[j]);
			    
			      String one = words[j] ; 
			      char[] wordChars = one.toCharArray();
			      int lastIndex = wordChars.length-1 ; 
			      
			      for (int i = 0; i < wordChars.length/2; i++) {
			        
			         char temp = wordChars[i]; 
			         wordChars[i] =  wordChars[lastIndex-i] ; 
			         wordChars[lastIndex-i] = temp ; 
			      }
			      // how to change char array to a String 
			      String reversed = new String(wordChars);
			      
			      reversedSentence = reversedSentence + reversed + " " ; 
			      //System.out.println(reversed);
			    
			    }
			    
			    System.out.println(reversedSentence);

	}

}
