package Day48;

public class StudentTester {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Maksat";
		p1.age=33;
		p1.gender='M';
		p1.height=5.8;
		
		Student s1=new Student();
		s1.name="Ihsan";
		s1.age=8;
		s1.height=3.9;
		s1.gender='M';
		s1.studentId=1122;

		
		s1.eat();
		
	}

}
