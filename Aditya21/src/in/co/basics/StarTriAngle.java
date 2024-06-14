package in.co.basics;

public class StarTriAngle {
	public static void main(String[] args) {
		String A = "*";
		for (int shoot = 1; shoot <= 5; shoot++) {
			for (int aditya = 1; aditya <= shoot; aditya++) {
				System.out.print(A + " ");
			}
			System.out.println();
		}
	}
}
