package Day22;

import java.util.Arrays;

public class againArrayPractice {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(getArrayFromitoX(10)));
	}
public static int[] getArrayFromitoX(int x) {
	int[] arr=new int[x];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=i+1;
	}
	
	return arr;
}

}
