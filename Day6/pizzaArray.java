package Day6;
import java.util.*;
public class pizzaArray {
	public static void main(String[] args) {

	String [][] pizza= {{"mushroom","black olive","green pepper"},
	         {"spinach","green pepper","mushroom"},
	         {"black olive","black olive","spinach"},
	         {"mushroom","mushroom","red pepper"},
	         {"banana pepper","spinach","red pepper"},
	         {"mushroom","green pepper","green pepper"},
	         {"spinach","green pepper","mushroom"}};
	
	//System.out.println(Arrays.deepToString(pizza));
	
//	for(int i=0;i<pizza.length;i++)
//	{
//		for(int j=0;j<pizza[i].length;j++)
//		{
//			System.out.print(pizza[i][j]+" ");
//		}
//		System.out.println();
//	}
//	System.out.println();
//	
//	for(String[] row :pizza)
//	{
//		for(String column : row)
//		{
//			System.out.print(column+" ");
//		}
//			System.out.println();
//	}
	me:
	for(int i=0;i<pizza.length;i++)
	{
		System.out.println("Slice number: "+(i+1));
		if(i==2)
			continue;
		for(int j=0;j<pizza[i].length;j++)
		{if(pizza[i][j].contentEquals("banana pepper"))
			break me;
			System.out.print(pizza[i][j]+" ");
			
		}
		System.out.println();
	}
	}
}
