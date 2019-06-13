package Day45;

public class Student {
String name;
int age;
String major;
public Student() {
	this("Noname");
	System.out.println("no arg");
}
public Student(String name) {
	
	System.out.println("1 arg"+name);
}
public Student(String name, int age, String major) {
	this();
//	this.name = name;
//	this.age = age;
//	this.major = major;
	System.out.println("3 arg");
}


}
