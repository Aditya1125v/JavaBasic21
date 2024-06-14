package in.co.OOP;

public class Rectangle1 extends Shape1{
private int length;
private int width;
public Rectangle1() {
} 
public Rectangle1(int length, int width) {
	this.length=length;
	this.width=width;
}
public double area(){
	System.out.println("Area of rectangle : ");

	return length*width;
	}
}
