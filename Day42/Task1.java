package Day42;

import java.util.*;


public class Task1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrlist= new ArrayList<>();
		arrlist.add(1);
		arrlist.add(3);
		arrlist.add(5);
		arrlist.add(6);
		arrlist.add(7);
		System.out.println(arrlist);
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,3,5,6,7));
		System.out.println(list1);
		for(int i=0;i<arrlist.size();i++)
		{
			arrlist.set(i, arrlist.get(i)*2);
		}
		System.out.println(arrlist);
		
		Collections.reverse(arrlist);
		System.out.println(arrlist);
		
		ArrayList<Integer> a= new ArrayList<>(arrlist);
		System.out.println(a);

	}

}
