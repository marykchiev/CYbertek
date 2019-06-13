package Day44;
import java.util.*;
public class JobSeeker {

	public static void main(String[] args) {
		Job j1=new Job();
		Job j2=new Job("Senior SDET");
		Job j3=new Job("Senior SDET","Microsoft", 130000);
		Job j4=new Job("Senior SDET","Oracle", 150000);
		Job j5=new Job("Senior SDET","Google", 135000);
		Job j6=new Job("Senior SDET","Amazon", 115000);
		Job j7=new Job("Senior SDET","HILTI", 125000);
		
		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);
		System.out.println(j4);
		System.out.println(j5);
		System.out.println(j6);
		System.out.println(j7);
		
		List<Job> jobs= new ArrayList<>();
		jobs.add(new Job("Programmer","Apple",100000));
		jobs.add(j1);
		jobs.add(j2);
		jobs.add(j3);
		jobs.add(j4);
		jobs.add(j5);
		jobs.add(j6);
		jobs.add(j7);
		//System.out.println(jobs);
		for(Job each:jobs)
			System.out.println(each);
		
		
		
		
		
		

	}

}
