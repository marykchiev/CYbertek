package Day22;
import java.util.*;
public class practiceArrayL1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums=new ArrayList<>();
		int sum=0;
		int avrge=0;
		for(int i=1;i<=100;i++)
		{
			nums.add(i);
		
		}
		for(int l=1;l<=100;l++)
		{
			sum=sum+l;
		
		}
		System.out.println(nums);
		avrge=sum/100;
		System.out.println(sum);
		System.out.println(avrge);
		ArrayList<Integer> nums2=new ArrayList<>();
		for(int j=100;j>=1;j--)
		{
			nums2.add(j);
		}
		int count=0;
		for(int each: nums2)
		{
			if(each%3==0 && each%5==0)
			{
				++count;
			}
		}
		System.out.println(count);
		nums.addAll(nums2);
		System.out.println(nums);
		
	}

}
