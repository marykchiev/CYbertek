package Day62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionFramework {

	  public static void main(String[] args) {
	    
	    // GIVEN 
	    String str = "ABCABCEFGADBHYKJSGD"; 
	    // Find Out how many unique character 
	  
	    
	    // HINT : 
	    
	    // Convert this to an array 
	    
	    // store it in List 
	    
	    // use one of data structure that store unique element 
	    
	    String [] arr = str.split("");
	    Set<String> a = new TreeSet<>(Arrays.asList(arr));
	    System.out.println(a.size());
	    
	    Set<Character> charSet = new HashSet<>(); 
	    
	    for (int i = 0; i < str.length(); i++) {
	      //System.out.println(  str.charAt(i)  );
	      charSet.add( str.charAt(i) ) ; 
	    }
	    System.out.println(  charSet);
	     
	     
	     
	     
	    
	    
	    
	    
	  }

	}