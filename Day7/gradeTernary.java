package Day7;

import java.util.Scanner;

public class gradeTernary {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter grade:");
		int grade = scan.nextInt();
		String letterGrade = (grade >=90 && grade <=100)? "A" : (grade >=80)? "B" : (grade>=70)? "C" : (grade >=60)? "D" : "F";
		System.out.println(letterGrade);
	}

}
