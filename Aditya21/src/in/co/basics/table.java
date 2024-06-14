package in.co.basics;

public class table {
	public static void main(String[] args) {
		int[] a = { 1,2, 3, 4, 5, 6, 7,  8, 9, 10 };
		for (int i = 1; i <= a.length; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + "X" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}
