package Day7;

import java.util.Scanner;

public class amazonSearch {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word to search on Google:");
		String wordName = scan.nextLine();
		
		String str = "About 813,000,000 results (0.56 seconds)";
		
		if(str.substring(0,5).contentEquals("About"))
		{
			System.out.println("it started with About");
		}
		else
		{
			System.out.println("it did not started with About");
		}
		if(str.contains("results"))
		{
			System.out.println("it passed");
		}
		else
		{
			System.out.println("it failed");
		}
			
		}
		
	}

