package Day54;

public class OnlineStudent extends Student{

	int zoomID;

	@Override
	public void attendClass() {
		// TODO Auto-generated method stub
		System.out.println("Attend class online");
	}
	
	public static void main(String[] args) {
		
		OnlineStudent s1= new OnlineStudent();
		s1.id=101;
		s1.name="Maksatbek";
		s1.zoomID=20001;
		s1.attendClass();
		
		
	}
	
	
	
	
	
	
}
