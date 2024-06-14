package in.co.basics;

public class StarPatternRAJU {
	public static void main(String[] args) {
		String A = "RAJU";

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(A + " ");
			}
			System.out.println();
		}
	}
}
