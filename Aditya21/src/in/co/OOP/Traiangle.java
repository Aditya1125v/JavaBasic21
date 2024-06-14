package in.co.OOP;

public class Traiangle extends Shape {

	private int height;
	private int base;
	public Traiangle() {
		
	}

	public Traiangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public int getBase() {
		return base;
	}

	public double area() {
		return base * height *0.5;
	}
	
	public static void main(String[] args) {
		Traiangle t = new Traiangle(10, 20);
		System.out.println(t.area());
		
	}
}
