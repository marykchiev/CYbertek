package Day46;

public class PersonAction {

	public static void main(String[] args) {
		
		Person p1= new Person("Maksatbek", 5.8, 'M');
		Person p2= new Person("Marat", 5.6, 'M');
		Person p3= new Person("Muratbek", 5.4, 'M');
		
		System.out.println(Person.race);
		
		System.out.println(p1.race);
		
		Person.race="Spartan";
		
		System.out.println(p1.race);
		Person.race="Martian";
		
		System.out.println(p1.race);
		
		
		

	}

}
