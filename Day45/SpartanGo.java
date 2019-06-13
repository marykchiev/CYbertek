package Day45;

public class SpartanGo {

	public static void main(String[] args) {
		//Spartan s1=
		Spartan s2= new Spartan("Maksatbek", 8, 600, false, new String[] {"OCA","AWS","PSM"});
		Spartan s3= new Spartan("Murat", 7, 600, true, new String[] {"OCA",null,"PSM"});
		Spartan s4= new Spartan("Kanat", 6, 600, false, new String[] {"OCA"});
		Spartan s5= new Spartan("Salim", 5, 600, true, new String[] {null,null,null});
		Spartan s6= new Spartan("Marat", 4, 600, false, new String[] {"OCA","AWS","PSM"});
		Spartan s7=new Spartan(true);
		System.out.println(s7);
		
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
	}

}
