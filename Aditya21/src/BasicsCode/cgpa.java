package BasicsCode;

import java.util.Scanner;

public class cgpa {
	public static void main(String[] args) {
		System.out.println("Enter the value of A, B, C, D and E");
		Scanner sc = new Scanner(System.in);
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		float D = sc.nextFloat();
		float E = sc.nextFloat();
		float F = (A + B + C + D + E) / 50;
		System.out.println("CGPA OF 5 SUBJECT = " + F);
	}

}
