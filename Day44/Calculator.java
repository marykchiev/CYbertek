package Day44;

public class Calculator {

	public static void main(String[] args) {
		MathEquation m1=new MathEquation(100, 200,'+');
		MathEquation m2=new MathEquation(50.0, 25.0,'-');
		MathEquation m3=new MathEquation(99.5, 500,'*');
		MathEquation m4=new MathEquation(10000, 200,'/');
		
		MathEquation[] arr=new MathEquation[] {m1,m2,m3,m4};
		for(MathEquation each: arr)
		{	each.calculate();
			System.out.println(each);
		}
		
		

	}

}
