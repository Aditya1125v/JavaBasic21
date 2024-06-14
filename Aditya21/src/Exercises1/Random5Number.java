package Exercises1;

public class Random5Number {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i = i + 1) {/// what happen when i++ change into i=i+i
			int d = (int) (Math.random() * 100);
			System.out.print(d + " ");
		}
	}
}
