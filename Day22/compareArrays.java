package Day22;

import java.util.*;

public class compareArrays {

	public static void main(String[] args) {
		int[] a={1,2,3};
		int[] b={1,2,3,4};
		
reportBiggerArray(a,b);
	}
public static void reportBiggerArray(int[] a, int[] b) {
	
	if(a.length>b.length)
	{
		System.out.println(Arrays.toString(a));
	}
	else
	{
		System.out.println(Arrays.toString(b));
	}
}
}
