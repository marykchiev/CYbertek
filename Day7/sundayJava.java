package Day7;

public class sundayJava {
	public static void main(String[] args) {
		
		String sunday = "Sunday is a Java Day";
		
		String day = sunday.toUpperCase();
		String lastTwo = sunday.substring(sunday.length()-2,sunday.length() );
		//Int indexIs=sunday.indexOf('i');
		Boolean b = sunday.contains("Java");
		int firstSpace = sunday.indexOf(" ");
		//String firstWord = sunday.substring(0, firstSpace);
		int secondSpace = sunday.indexOf(" ", firstSpace+1);
		String secondWord = sunday.substring(firstSpace+1, secondSpace);
		int thirdSpace = sunday.indexOf(" ", secondSpace+1);
		String thirdWord = sunday.substring(secondSpace+1, thirdSpace);
		int fourthSpace = sunday.indexOf(" ", thirdSpace+1);
		String fourthWord = sunday.substring(thirdSpace+1, fourthSpace);
		
		String fifthWord = sunday.substring(fourthSpace+1);
		int longestWord = 0;
		
		if((firstSpace-0)>(secondSpace-firstSpace))
		
//		System.out.println(day);
//		System.out.println(lastTwo);
//		System.out.println(sunday.indexOf('i'));
//		System.out.println(b);
		System.out.println("Index of first space is "+firstSpace);
		//System.out.println("FIrst word is "+"\""+firstWord +"\"");
		System.out.println("Index of second space is "+secondSpace);
		System.out.println("Second word is "+"\""+secondWord+"\"");
		System.out.println("Index of third space is "+thirdSpace);
		System.out.println("Third word is "+"\""+thirdWord+"\"");
		System.out.println("Index of fourth space is "+fourthSpace);
		System.out.println("Fourth word is "+"\""+fourthWord+"\"");
		System.out.println("Fifth word is "+"\""+fifthWord+"\"");
	}

}
