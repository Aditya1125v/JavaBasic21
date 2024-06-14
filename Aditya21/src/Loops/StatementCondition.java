package Loops;

import java.util.Scanner;

public class StatementCondition {
	public static void main(String[] args) {
		System.out.println("Enter the value of x");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		if (money > 300) {
			System.out.println("Wow!!I can buy pizza");
		} else {
			System.out.println("Sorry! but i want burger");
		}

	}
}
