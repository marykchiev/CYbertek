package Day22;

public class jumadilov {
	public static void main(String[] args) {
		char lastName[]= {'J','U','M','A','D','I','L','O','V'};
		
		for(int i=0;i<=lastName.length-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print(lastName[i]);
			}
			System.out.println();
		}
	}

}
