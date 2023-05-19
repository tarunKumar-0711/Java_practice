package javaPractice;
import java.util.*;

abstract class Shape{
	String color;
	
	public Shape(String color) {
		System.out.println("Abstract class constructor is called.");
		this.color=color;
	}
	
	
	public abstract double area();
	public abstract String toString();
	
	public String getColor(String color) {
		return color;
	}
}


class Rectangle extends Shape{
	String shape ="rectangle";
	int length,breadth;
	
	public Rectangle(String color,int length,int breadth) {
		super(color);
		System.out.println("Rectangle class constructor is called.");
		this.length = length;
		this.breadth= breadth;
	}
	
	@Override public double area() {
		return (double)(length*breadth);
	}
	
	@Override public String toString() {
		String res = "Shape is "+ shape + " color is "+ getColor(color)+ "Area is "+ area() ;
		return res;
	}
	
}
public class Abstract1 {
	public static void main(String args[]) {
		Shape s1 = new Circle("green", 2.5);
		System.out.println(s1.toString());
		
		Shape s2 = new Rectangle("blue", 2,5);
		System.out.println(s2.toString());
	}
}
