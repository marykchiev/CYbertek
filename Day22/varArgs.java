package Day22;

public class varArgs {
	public static void main(String[] args) {
		String sentence = wordBuilder("Snail", "Pillbug", "Bird", "cat", "fish");
		System.out.println(sentence);
	}
static String wordBuilder(String... str) {
	String newWord="";
	for(String each:str)
	{
		newWord+=each+" ";
	}
	return newWord;
}
}
