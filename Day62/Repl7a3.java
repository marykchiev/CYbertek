package Day62;

import java.util.Scanner;

public class Repl7a3 {
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("# in:");
		    int amt = inp.nextInt();
		    inp.nextLine(); //this line is necessary
		    System.out.print("word:");
		    String word = inp.nextLine();
		    //leave the above unedited, write your code below:
		    if(amt==1) {
		    	System.out.println(amt+" "+word);
		    }
		    else if(amt>1 && (word.substring(word.length()-2).equals("fe"))){
		    	System.out.println(amt+" "+word.substring(0,word.length()-2)+"ves");
		    }
		    else if(amt>1 &&(word.substring(word.length()-2).equals("us"))) {
		    	System.out.println(amt+" "+word.substring(0,word.length()-2)+"i");
		    }
		    else if(amt>1 &&(word.substring(word.length()-2).equals("sh"))||word.substring(word.length()-2).equals("ch")) {
		    	System.out.println(amt+" "+word+"es");
		    }
		    else if(amt>1 && (word.substring(word.length()-1).equals("y"))){
		    	System.out.println(amt+" "+word.substring(0,word.length()-1)+"ies");
		    }
		    else if(amt>1 &&(word.substring(word.length()-2).equals("ay"))||word.substring(word.length()-2).equals("oy")||word.substring(word.length()-2).equals("ey")||word.substring(word.length()-2).equals("uy")) {
		    	System.out.println(amt+" "+word+"s");
		    }
		    else {
		    	System.out.println(amt+" "+word+"s");
		    }
		  }
}
