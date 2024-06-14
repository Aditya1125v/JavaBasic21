package in.co.basics;

public class TestMethod1 {
	public static void Add(int i, int j) {
		int Add = i + j;
		System.out.println(Add);

	}

	public static void Division(int i, int j) {
		int division = i / j;
	}

	public static void main(String[] args) {

		Sub(30, 10);
		Multiply(10, 20);
		Add(10, 20);
	}

	public static void Multiply(int i, int j) {
		int multiply = i * j;
		System.out.println(multiply);
	}

	public static void Sub(int i, int j) {
		int sub = i - j;
		System.out.println(sub);
	}
}
