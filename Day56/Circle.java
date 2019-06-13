package Day56;

public class Circle extends Shape{
	
	double radius;
	
public Circle(String color, double radius) {
		super(color);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

@Override
public void calculatePerimeter() {
	// TODO Auto-generated method stub
	double c= 2*3.14*radius;
	System.out.println(c);
}

@Override
public double calculateArea() {
	// TODO Auto-generated method stub
	double area= 3.14*radius*radius;
	return area;
}

@Override
public String toString() {
	return "Circle [radius=" + radius + ", color=" + color + "]";
}

public static void main(String[] args) {
	Circle c1= new Circle("blue", 10);
	System.out.println(c1);
	c1.calculatePerimeter();
	
}



}
