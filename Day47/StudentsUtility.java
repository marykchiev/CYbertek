package Day47;

import java.util.ArrayList;

public class StudentsUtility {

	private static ArrayList<String> studentList;
	
	static {
		System.out.println("Welcome to Student Utility");
	}
	
	static {
			loadAllMyData();
			System.out.println("All Students has been loaded");
	}
	
	public static void loadAllMyData() {
		studentList=new ArrayList<String>();
		studentList.add("Maksatbek");
		studentList.add("Muratbek");
		studentList.add("Marat");
		studentList.add("Kubanych");
		studentList.add("Ashraf");
		studentList.add("Erdem");
		studentList.add("Ansaer");
		studentList.add("Ali");
		studentList.add("Ihsan");
		studentList.add("Baatyr");
		studentList.add("Myrzabek");
	}
	public static void displayAllStudents() {
		for(String each:studentList) {
			System.out.println(each);
		}
	}
	
	public static void addStudent(String name) {
		studentList.add(name);
	}
	
	public static void updateStudent(int index, String newName) {
		studentList.set(index, newName);
	}
	
	public static void removeStudent(int index) {
		studentList.remove(index);
	}
	
	public static void resetTheList() {
	    studentList.clear();
	  }
	
	public static void main(String[] args) {
		loadAllMyData();
		displayAllStudents();
		removeStudent(3);
		System.out.println(studentList);
		updateStudent(0, "Maksatbek Arykchiev");
		displayAllStudents();
		System.out.println("----------------------------------------");
		
		resetTheList();
		displayAllStudents();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
