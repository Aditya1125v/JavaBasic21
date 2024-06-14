package in.co.OOP;

public class Circle1 extends Shape1 {
	private double radius;
	public Circle1() {

}
	public Circle1(double radius) {
		this.radius=radius;
	}
	public double area() {
		System.out.println("Area of Circle : ");
		return 3.14*radius*radius;
		}
	}