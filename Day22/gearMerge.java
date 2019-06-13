package Day22;

public class gearMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String k="java";
String l="programming";
//System.out.println(mergeStrings(k,l));
//
//System.out.println( uniqueChars("wooden-spoon") ) ;

System.out.println(coverString("java methods meet", "me") ) ;
	}
//	  public static String mergeStrings(String one, String two) {
//		    String str="";
//		    int a=one.length();
//		    int b=two.length();
//		   
//		    String shortWord="";
//		    String longWord="";
//		     if(a<b)
//		     {
//		     shortWord=one;
//		     longWord=two;
//		     }
//		     else
//		     {
//		     shortWord=two;
//		     longWord=one;
//		     }
//		    int c=shortWord.length();
//		    for(int i=0;i<c;i++)
//		    {
//		      //str=str+shortWord.charAt(i)+longWord.charAt(i);
//		      str=str+longWord.charAt(i)+shortWord.charAt(i);
//		    }
//		    str=str+longWord.substring(c);
//		    return str;
//		    
//		  }
//	  public static String uniqueChars(String str) {
//		    //TODO: write your below
//		    String newStr="";
//		    for(int i=0;i<str.length();i++)
//		    {
//		      if(!newStr.contains(str.substring(i,i+1)))
//		      {
//		    	  newStr=newStr+str.substring(i,i+1);
//		      }
//		      
//		    }
//		    return newStr;
//		  }
	  public static String coverString(String main, String coverME) {
		    String str="["+coverME+"]";
		    String newWord="";
		    for(int i=0;i<main.length()-coverME.length();i++)
		    {
		    	if(main.indexOf(coverME)==i)
		    	{
		    		newWord=newWord.concat(main.substring(0,i).concat(str).concat(main.substring(i+coverME.length())));
		    	}
		   
		    }
		    return newWord;
		    
		  }
}
