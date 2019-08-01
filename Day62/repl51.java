package Day62;

import java.util.Scanner;

public class repl51 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner inp = new Scanner(System.in);
//		    System.out.print("In:");
//		    String word = inp.nextLine();
//		    //write your code below
//		    for(int i=0;i<word.length();i++)
//		    {
//		      if(word.charAt(i)==('a')||word.charAt(i)==('e')||word.charAt(i)==('o')||word.charAt(i)==('u'))
//		      System.out.print(word.charAt(i));
//		      else
//		      continue;
//		    }
		
		public static void main(String[] args)
		{
			int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			int[] sums = rowSums(a);
			for(int sum : sums)
				System.out.println(sum);
			//this should print 4 6 11 3
		}
		public static int[] rowSums(int[][] nums)
		{
			int[] arr=new int[nums.length];
			for(int i=0;i<nums.length;i++) {
				for(int j=0;j<nums[i].length;j++)
				{
					arr[i]+=nums[i][j];
				}
			}
			return arr;
		}
	}


