package Day43;
import java.util.*;
public class Repl194 {

	public static void main(String[] args) {
		String word1="Listen";
		String word2="Sil ent";
		word1=word1.replaceAll(" ","");
		word1=word1.toLowerCase();
		
		word2=word2.replaceAll(" ","");
		word2=word2.toLowerCase();
		
		String[] arr1=word1.split("");
		String[]arr2=word2.split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
	

}
