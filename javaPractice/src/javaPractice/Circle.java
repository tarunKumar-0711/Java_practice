package javaPractice;
public class Circle extends Shape{
	String shape= "circle";
	double radius;
	
	public Circle(String color,double  radius) {
		super(color);
		System.out.println("Circle class constructor is called.");
		this.radius=radius;
	}
	
	@Override public double area()
	{
		return Math.PI*radius*radius;
	}
	
	@Override public String toString() {
		String res = "Shape is "+ shape + " color is "+ getColor(color)+ "Area is "+ area() ;
		return res ;
	}
}