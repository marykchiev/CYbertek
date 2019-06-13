package Day22;
import java.util.*;
public class groceryArray {
	public static void main(String[] args) {
		String groceries="tomato,cucumber,apple,orange,banana,egg,milk,broccoli,onion,cereal,pepper,tea,water,almonds, avacado,grapes,melon";
		
		String[] grocery=groceries.split(",");
		System.out.println(Arrays.deepToString(grocery));
		int items=grocery.length;
		System.out.println("How many items in the list: "+items);
		for(int i=0;i<items;i++)
		{
			System.out.println("Length of Item" +i +": "+grocery[i].length());
		}
	}

}
