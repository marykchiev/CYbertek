package Day39;

import java.util.ArrayList;

public class appendPosSum {

	public static void main(String[] args)
	{
		
	}
	//create your method below
	static ArrayList<Integer> appendPosSum(ArrayList<Integer> x)
	{
	  ArrayList<Integer> nums=new ArrayList<>();
	  int a=0;
	  for(int i=0;i<x.size();i++)
	  {
	    if(x.get(i)>0)
	    {
	      nums.add(x.get(i));
	      a=a+x.get(i);
	    }
	  }
	  nums.add(a);
	  return nums;
	}
}
