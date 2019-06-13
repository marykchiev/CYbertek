package Day22;

public class countFound {

	public static void main(String[] args) {
		System.out.println(countString("crazy crayfish crushing craniums", "cra"));
		System.out.println(countString("sometimes solutions dont come on time", "me"));

	}
	static int countString(String str, String toFind)
	{
		int a=0;
		int count=0;
		int b=toFind.length();
		do
		{
		  a=str.indexOf(toFind);
		  if(a>=0)
		  {
		    ++count;
		    str=str.substring(a+b);
		    a=0;
		  }
		}while(a>=0);
		return count;
	}
}
