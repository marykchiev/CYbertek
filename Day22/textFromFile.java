package Day22;
import java.util.*;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class textFromFile {

	public static void main(String[] args) {
		List<String> lst=getTextFileAsList("me.txt");
		System.out.println(lst);

	}

	public static List<String> getTextFileAsList(String filePath) {

	    List<String> allLines = null;
	    try {
	      allLines = Files.readAllLines(Paths.get(filePath));
	    } catch (Exception e) {
	      System.out.println("Wrong file path probably");
	    }
	    return allLines;

	  }

}
