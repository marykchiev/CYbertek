package Day22;

public class addSpaceMethod {

	public static void main(String[] args) {
		System.out.println(spaceOut("hello")); //"h e l l o "
		System.out.println(spaceOut("technology")); //"t e c h n o l o g y "

	}
	static String spaceOut(String s)
	{
		String str="";
		for(int i=0;i<s.length();i++)
		{
		  str+=s.substring(i,i+1)+" ";
		}
		return str;
	}
}
