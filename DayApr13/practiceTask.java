package DayApr13;

import java.util.Arrays;

public class practiceTask {
	public static void main(String[] args) {
		
//		Saturday WARM UP Tasks : 
//
//			//Task1 : 
//				create an array of int with 5 items , return true if all items are more than 10
//				return false if not
		boolean bool=true;
		int nums[]= {10,20,30,40,9};
		for(int i=0;i<5;i++)
		{
			if(nums[i]<10)
			{
				bool=false;
				break;
			}
			
		}
		System.out.println(bool);
		
		int min=10;
		for(int t=0;t<nums.length;t++)
		{
			if(nums[t]<min);
			min=nums[t];
		}
		if(min<10)
			System.out.println("false");
		else
			System.out.println("true");
//			//Task 2 :
//			given : 
//		use the method your learned to get each words
//		and store it into String array: 
			String str = "Cybertek Batch Spartan is most hardworking Batch ever";
			String[] cyberTek=str.split(" ");
			System.out.println();
			System.out.println(Arrays.toString(cyberTek));
			for(String eachWord : cyberTek)
			{
				System.out.print(eachWord+" ");
			}
			String revString="";
			for(int k=0;k<cyberTek.length;k++)
			{
				String word=cyberTek[k];
				String revWord="";
				for(int l=word.length()-1;l>=0;l--)
				{
					revWord=revWord+word.charAt(l);
				}
				revString=revString+revWord+" ";
			}
			System.out.println();
			System.out.println(revString);
System.out.println();


//
//			loop through each items -- 
//			  in each iteratrion loop : 
//			  	 turn each word into char array 
			for(int j=0;j<cyberTek.length;j++)
			{
				String tempWord=cyberTek[j];
				char[] wordsArray=tempWord.toCharArray();
				for(int r=0;r<wordsArray.length;r++)
				{
				System.out.print(wordsArray[r]+"-");
				}
				System.out.println();
			}
			
//			  	 print each char out with seperated by -
//			output : 
//				C-y-b-e-r-t-e-k-
//				B-a-t-c-h-
//				S-p-a-r-t-a-n-
//				i-s-
//				m-o-s-t-
//				h-a-r-d-w-o-r-k-i-n-g-
//				o-n-e-
//				e-v-e-r-
//
//			// Optional : Reverse each word in sentence
//			your output should be 
//			ketrebyC hctaB natrapS si tsom gnikrowdrah eno reve 
	}

}
