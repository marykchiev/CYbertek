package Day46;
import java.util.*;

import Day42.Employee;

public class SlackAction {

	public static void main(String[] args) {
		SlackUser s1= new SlackUser("Maksatbek", "maksatbek@gmail.com", 31);
		SlackUser s2= new SlackUser("Ashraf", "ashraf@cybertek.com", 20);
		SlackUser s3= new SlackUser("Marat", "marat@gmail.com", 8);
		SlackUser s4= new SlackUser("Erdem", "erdem@yahoo.com", 4);
		
		ArrayList<SlackUser> lst1= new ArrayList<>();
		lst1.add(s1);
		lst1.add(s2);
		lst1.add(s3);
		lst1.add(s4);
		for(SlackUser each: lst1) {
		System.out.println(each);
		}
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		

	}

}
