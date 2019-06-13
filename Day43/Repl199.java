package Day43;

import java.util.Arrays;

public class Repl199 {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		System.out.println(Arrays.toString(do_switch(nums)));

	}
	public static int[] do_switch(int[] i) 
	 {
	int[] arr=new int[i.length];
	arr[arr.length-1]=i[0];
	arr[0]=i[i.length-1];
	for(int j=1;j<arr.length-1;j++)
	{
	  arr[j]=i[j];
	}
	return arr;
}
}
