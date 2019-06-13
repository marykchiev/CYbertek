package Methods;

public class Methods {
	public static void main(String[] args) {
		helloWorld();
		helloWorldTo("Maksatbek");
		
		int x =returnFive();
		System.out.println(x);
		
		int y=square(100);
		System.out.println(y);
		
	}
	
	static int square(int x) {
		
		return x*x;
	}

	static int returnFive() {
		return 5;
	}
	static void helloWorldTo(String name) {
		System.out.println("Hello "+name);
	}
	static void helloWorld() {
		System.out.println("Hello World!");
	}
}
