package Day45;

import java.util.Arrays;

public class Spartan {
	String name;
	int studyHour;
	int stressLevel;
	boolean tired;
	String[] certificates;
	
	public Spartan() {
		
		this("noname", 5);
		
		//System.out.println("no arg");
		this.stressLevel=100;
		this.tired=false;
		//this.certificates="OCA";
	}
	
	public Spartan(String name, int studyHour) {
		this.name=name;
		this.studyHour=studyHour;
	}

	public Spartan(String name, int studyHour, int stressLevel, boolean tired, String[] certificates) {
		this();
		this.stressLevel = stressLevel;
		this.tired = tired;
		this.certificates = certificates;
	}

	
	public String toString() {
		return "Spartan [name=" + name + ", studyHour=" + studyHour + ", stressLevel=" + stressLevel + ", tired="
				+ tired + ", certificates=" + Arrays.toString(certificates) + "]";
	}
	
	public Spartan(boolean tired) {
		this("noname",33,500,false, new String[] {"OCA"});
		//System.out.println("boolean arg");
	}
	

}
