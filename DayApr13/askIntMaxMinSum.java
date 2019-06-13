package DayApr13;

import java.util.*;

public class askIntMaxMinSum {
 public static void main(String[] args) {
	
	 Scanner scan=new Scanner(System.in);
		System.out.println("Please enter five numbers: ");
		int nums[]=new int[5];
		for(int i=0;i<5;i++)
		{
			nums[i]=scan.nextInt();
		}
		int sum=0;
		int max=0;
		int min=nums[0];
		
		for(int j=0;j<5;j++)
		{
			sum=sum+nums[j];
			if(max<nums[j])
				max=nums[j];
			if(min>nums[j])
				min=nums[j];
						
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Max is: "+max);
		System.out.println("Min is: "+min);
		int maxNum=nums[0];
		int minNum=nums[0];
		int sumNum=0;
		for(int k:nums)
		{
			sumNum=sumNum+k;
			if(k>maxNum)
				maxNum=k;
			if(k<minNum)
				minNum=k;
		}
		System.out.println(sumNum);
		System.out.println(maxNum);
		System.out.println(minNum);
		
		String[] hero = {"me","you","he", "she", "we", "they", "all"};
		Arrays.sort(hero);
		System.out.println(Arrays.toString(hero));
}
}
