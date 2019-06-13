package Day22;

public class task2 {
	public static void main(String[] args) {
		
		int nums[]= {1,4,6,8,9};
		nums[2]=nums[2]*2;
		nums[3]=nums[0]+nums[1];
		for(int i=0;i<=4;i++) {
			System.out.print(nums[i]+" ");
		}
		int temp=nums[0];
		nums[0]=nums[4];
		nums[4]=temp;
		System.out.println();
		System.out.println(nums[0]);
		System.out.println(nums[4]);
		for(int i=0;i<=4;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		int max=0;
		for(int k=0;k<=4;k++)
		{
			if(nums[k]>max)
			{
				max=nums[k];
			}
		}
		System.out.println("Max number is " +max);
		System.out.println("Sum is "+(nums[0]+nums[1]+nums[2]+nums[3]+nums[4]));
		
	}

}
