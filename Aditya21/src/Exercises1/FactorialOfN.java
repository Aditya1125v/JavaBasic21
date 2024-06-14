package Exercises1;

public class FactorialOfN {
	public static void main(String[] args) {
		int fact = 1;

		int A = 8;
		for (int i = 1; i <= A; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + A + "is; " + fact);
	}
}
