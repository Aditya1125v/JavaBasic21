package in.co.OOP;

public class Triangle1 extends Shape1 {
private int base;
private int height;
public Triangle1 () {
}
public Triangle1 (int base, int height) {
	this.base=base;
	this.height=height;
}
public double area() {
	System.out.println("Area of triangle : ");
	return 0.5*base*height;
}
}
