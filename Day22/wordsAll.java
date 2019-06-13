package Day22;

public class wordsAll {
	public static void main(String[] args) {
		String strt="We are all Testers";
		System.out.println(GetMystr(strt));
	}
public static String GetMystr(String str) {
	String targetWord="";
String[] arr=str.split(" ");
targetWord=arr[0].substring(0,1)+arr[arr.length-1].substring(1);
return targetWord;
}
}
