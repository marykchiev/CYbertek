package Day22;

public class nestedLoopExample {
	public static void main(String[] args) {
		
		String str="5 Little Monkeys Jumping on the Bed";
		int a='a';
		int b='z';
		int c=str.length()-1;
		char eachChar='h';
		
	for(int i=0;i<=c;i++)
	{
		eachChar=str.charAt(i);
		if(eachChar>='a' && eachChar <='z')
		{
			System.out.print(eachChar);
		}
	}
	}

}
