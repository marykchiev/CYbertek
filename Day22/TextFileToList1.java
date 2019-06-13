package Day22;

import java.nio.file.*;
import java.util.*;

public class TextFileToList1 {

	public static void main(String[] args) {
		//String fullP="/CYbertek/newfile";
		List<String> lineLst = getTextFileAsList("brandnew.txt");
//		System.out.println(lineLst);
//		System.out.println(lineLst.size());
		
		//**********************count excel files*****************************
		int count=0;
		for(String each:lineLst)
		{
			if(each.endsWith(".xls")) {
				count++;
			}
		}
		//System.out.println(count);
		//*********************find longest file name******************************
		String longest=lineLst.get(0);
		for(String ln:lineLst) {
			if(ln.length()>longest.length())
			{
				longest=ln;
			}
		}
		//System.out.println(longest);
		String extnsn=".doc";
		longests(lineLst, extnsn);
	}
	public static void longests(List<String> lineLst, String x)
	{
	String longest="";
	for(String each : lineLst)
	{
		if(each.endsWith(x) && (each.length()>longest.length()))
		{
			longest=each;
		}
	}
	System.out.println(longest);
	}
//		//****************find longest Excel file*****************************
//		String longestExcel="";
//		for(String each : lineLst)
//		{
//			if(each.endsWith(".xls") && (each.length()>longestExcel.length()))
//			{
//				longestExcel=each;
//			}
//		}
//		System.out.println(longestExcel);
		
	
	
	/*
	 * DO NOT MODIFY AND JUST USE IT
	 * Method name : getTextFileAsList
	 * @parameter  location of text file as String
	 * 	if your file is at root path (right under project folder)
	 *  you may directly path your filename.txt
	 *  if not pass /your/own/folder/name/filename.txt as String to method
	 * 
	 * @return List of String that contain each line as per element

	 */
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
