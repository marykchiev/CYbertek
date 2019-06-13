package Day22;

import java.nio.file.*;
import java.util.*;

public class ListWithMethods {
public static void main(String[] args) {
	
	List<String> lst=new ArrayList<>();
	lst.add("apple");
	lst.add("orange");
	lst.add("banana");
	lst.add("kiwi");
	
	printItems(lst);
	
}

//public static void addItems(List<String> strLst) {
//	strLst.add("apple");
//	strLst.add("orange");
//	strLst.add("banana");
//	strLst.add("kiwi");
//	
//	printItems(strLst);
//}
public static void printItems(List<String> strLst)
{
	for(int i=0;i<strLst.size();i++)
	{
		System.out.print(strLst.get(i)+"-");
	}
	System.out.println();
}
}
