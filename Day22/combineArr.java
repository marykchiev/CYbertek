package Day22;

import java.util.Arrays;

public class combineArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,3,4};
		int[] nums2= {5,6,7,8};
		System.out.println(Arrays.toString(combineArray(nums1, nums2)));

	}
public static int[] combineArray(int[] arr,int[] art) {
	int a=arr.length;
	int b=art.length;
	int c=a+b;
	int[] newNums=new int[c];
	for(int i=0;i<a;i++)
	{
		newNums[i]=arr[i];
	}
	for(int j=0;j<b;j++)
	{
		newNums[a+j]=art[j];
	}
	return newNums;
		
	
}
}
