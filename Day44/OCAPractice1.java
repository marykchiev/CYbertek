package Day44;

public class OCAPractice1 {

	public static void main(String[] args) {
//		String s="purr";
//		s.toUpperCase();
//		s.trim();
//		s.substring(1,3);
//		s+=" two";
//		int a=0;
//		a+=s.substring(4,3).length();
//		System.out.println(a);
//		System.out.println(s.length());
//		StringBuilder numbers= new StringBuilder("0123456789");
//		numbers.delete(2, 8);
//		System.out.println(numbers);

	    int score = 60;

        switch (score) {

            default:

                System.out.println("Not a valid score");

            case score < 70:

                System.out.println("Failed");

                break;

            case score >= 70:

                System.out.println("Passed");

                break;

        }
		
		
		
	}

}
