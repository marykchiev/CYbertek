package Day22;

public class newArrayAZ {
	public static void main(String[] args) {
	for(int k=0;k<10;k++)
	{
		for(int i='A';i<='Z';i++)
		{
			for(int j='A';j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
	}

}
