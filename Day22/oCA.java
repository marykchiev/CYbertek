package Day22;

public class oCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="was it a car or a cat i saw";
System.out.println(str.replace(" ", ""));
System.out.println(polindrome(str));
	}
	static boolean polindrome(String str) {
		boolean b=false;
		str=str.replace(" ","");
		String newStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newStr+=str.charAt(i);
		}
//		if(newStr.equals(str))
//			b=true;
			
			return newStr.equals(str);
	}
}
