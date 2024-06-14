package Exercises1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10; // number of terms to generate
		int firstTerm = 0, secondTerm = 1;

		System.out.println("Fibonacci Series up to " + n + " terms:");

		for (int i = 1; i <= n; i++) {
			System.out.print(firstTerm + " ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}