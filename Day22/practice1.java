package Day22;

public class practice1 {
	public static void main(String[] args) {
		char name[]=new char[9];
		name[0]='M';
		name[1]='A';
		name[2]='K';
		name[3]='S';
		name[4]='A';
		name[5]='T';
		name[6]='B';
		name[7]='E';
		name[8]='K';

		char lastName[]= {'A','R','Y','K','C','H','I','E','V'};
		System.out.println(name);
		System.out.println(lastName);
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
