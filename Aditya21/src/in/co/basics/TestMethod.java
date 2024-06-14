package in.co.basics;

public class TestMethod {
	public static int Add(int i, int j) {
		return i + j;
	}

	public static void Division(int i, int j) {
		int division = i / j;
	}

	public static void main(String[] args) {
		TestMethod M = new TestMethod();
		M.Sub(30, 10);
		M.Multiply(10, 20);
		System.out.println(M.Add(10, 20));
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