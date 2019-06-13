package Day22;

public class findLongest {
public static void main(String[] args) {
	System.out.println(findLongestOne("me","you","they","are","studying","longest","cybertek"));
}
static String findLongestOne(String... words) {
	String longest=words[0];
	for(int i=0;i<words.length;i++)
	{
		if(words[i].length()>longest.length())
		{
			longest=words[i];
		}
	}
return longest;	
}
}
