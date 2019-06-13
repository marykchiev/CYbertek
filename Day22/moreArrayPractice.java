package Day22;

import java.util.*;

public class moreArrayPractice {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int[] nums= {1,55,898,9,55};
		String str = Arrays.toString(nums) ;
	    System.out.println( str  );
	    int count=0;
	    for(int i=0;i<nums.length;i++)
	    {
	    	if(nums[i]>100)
	    	{
	    		count+=1;
	    	}
	    }
	    System.out.println(count);
	}

}
