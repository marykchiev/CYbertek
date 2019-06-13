package Day22;

import java.util.*;

public class practice2222 {
	public static void main(String[] args) {
		int[][] nums= {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		twoDPrinter(nums);
		
		String dog=null;
		System.out.println(dog.length());
	}
static void twoDPrinter(int[][] arr)
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
