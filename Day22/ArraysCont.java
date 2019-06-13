package Day22;

import java.util.*;

public class ArraysCont {
	public static void main(String[] args) {
		String thankYou[]=new String[101];
		for(int k=0;k<=100;k++)
		{
			thankYou[k]="Thank You Akbar";
		}
		for(int l=0;l<=100;l++)
		{
		System.out.println(thankYou[l]);
		}
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 	
		
	for(int i=0;i<courses.length;i++)
	{
		System.out.println("CourseId: "+courseId[i]+" Course Name: "+courses[i]);
	}
	
	//////////////////////counting courses that contains Software////////////////
	int count=0;
	for(int j=0;j<courses.length;j++)
	{
		if(courses[j].contains("Software"))
		{
			count+=1;
		}
	}
		System.out.println(count);
		
		
		
//		Scanner scan=new Scanner(System.in);
//		int[] newArray=new int[51];
//		
//		for(int i=0;i<=50;i++)
//		{
//			newArray[i]=i*2;
//			System.out.print(newArray[i]+" ");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(newArray));

	}

}
