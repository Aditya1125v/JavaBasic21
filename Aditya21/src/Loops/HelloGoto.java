package Loops;

public class HelloGoto {
	public static void main(String[] args) {
		int num = 0;

		// Label
		startLoop: while (true) {
			System.out.println("Current number: " + num);
			if (num == 10) {
				// Jump to the end of the loop
				break;
			}
			num++;
		}

		System.out.println("Loop ended.");
	}
}
