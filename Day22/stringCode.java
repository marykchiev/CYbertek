package Day22;

import java.util.Scanner;

public class stringCode {
	public static void main(String[] args) {
		//code
		Scanner scan=new Scanner(System.in);
		 String  str = scan.nextLine();
		int count=0;
		int a=str.length()-1;
		for(int i=0;i<=a-3;i++)
		{
			//cozexxcore
			if(str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e"))
			{
				count=count+1; //count+=1
			}
		}
		System.out.println(count);
	}

}
