package in.co.OOP;

public class Circle extends Shape{
    private double radius;
    private double area;
    public Circle() {
    	System.out.println("give radius first");
  	}
    public Circle (double radius) {
    	this.radius=radius;
    }
//	public double getRadius() {
//		return radius;
//	}
	public double Area() {
	    area= 3.1428*radius*radius;
	    return area;
	    }
	
//    public static void main(String[] args) {
//		Circle x=new Circle(8);
//		System.out.println("Area of Circle ; "+x.Area());
//	}
    	
}
