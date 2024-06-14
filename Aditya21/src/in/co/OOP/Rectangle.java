package in.co.OOP;

public class Rectangle extends Shape{ 
	private int length;
	private int width;
	private double area;
	public Rectangle() {
		System.out.println("Give the valve of Atributre");
	}
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
//	public int getLength() {
//		return length;
//	}
//	public int getWidth() {
//		return width;
//	}
	public double Area() {
		area=length*width;
		return area;
	}
//	public static void main(String[] args) {
//		Rectangle R= new Rectangle(20,30);
//		System.out.println("Area of Rectangle ; "+R.Area());
//	}
	}

