package Exercises1;

public class SumMultipleOf7 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		for (int i = 101; i < 200; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
				count++;
			}

		}
		System.out.println("The Sum Of The Number Between 100 To 200 Which Are Divisible By Is:" + sum);
		System.out.println("Total Numbers Between 100 To 200 Which Are Divisibe By 7 Is:" + count);
	}
}
