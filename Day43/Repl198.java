package Day43;
import java.util.*;
public class Repl198 {

	public static void main(String[] args) {
		ArrayList<Boolean> b= new ArrayList<>();
		b.add(false);
		b.add(true);
		b.add(true);
		repeatAL(b);
		
		System.out.println(b);

	}
	static void repeatAL(ArrayList<Boolean> b){
		  int a=b.size();
		  for(int i=0;i<a;i++)
		  {
		    b.add(b.get(i));
		  }
		}

}
