package Day39;

public class TeacherAction {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.setName("Maksatbek");
		t1.setSpecialty("PLTW Teacher");
		
		System.out.println(t1.getName());
		System.out.println(t1.getSpecialty());
		System.out.println();
		
		t1.setName("Marat");
		t1.setSpecialty("Computer Teacher");
		
		System.out.println(t1.getName());
		System.out.println(t1.getSpecialty());
		

	}

}
