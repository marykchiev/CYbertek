package Day62;

public class Repl8 {
	public static String[] combineNames(String[] first_names, String[] last_names)
	{
		String[] newarr=new String[first_names.length];
		for(int i=0;i<newarr.length;i++)
		{
		  newarr[i]=first_names[i].concat(last_names[i]);
		}
		return newarr;
	}
	
	public static void main(String[] args)
	{
		String[] first_names = {"bob","joe"};
		String[] last_names = {"jones","smith"};
		System.out.println(combineNames(first_names, last_names).toString());
		
	}

}
