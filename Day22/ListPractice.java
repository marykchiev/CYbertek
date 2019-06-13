package Day22;
import java.util.List;
import java.nio.file.*;
import java.util.*;


public class ListPractice {

    public static void main(String[] args) {
    	String fullP="/CYbertek/Day22/myfile.txt";
        List<String> lineLst = getTextFileAsList(fullP);
        System.out.println(lineLst);
        
       // System.out.println(lineLst.size());
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