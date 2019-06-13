package Day22;

import java.util.Scanner;

public class firstLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		scan.nextLine();
		String[] names=new String[x];
		
		for(int i=0;i<x;i++)
		{
		  names[i]=scan.nextLine();
		}
		for(int j=0;j<x;j++)
		{
		  System.out.print(names[j].substring(0,1));
		  
		}
	}

}
