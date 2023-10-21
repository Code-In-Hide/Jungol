package Qize.Q1341;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 > 1 && num1 < 10 && num2 > 1 && num2 < 10) {
			if (num1 > num2) {
				for (int j = num1; j >= num2; j--) {
					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d * %d = %2d   ", j, i, j * i);
						if (i % 3 == 0) {
							System.out.println();
						}
					}
					System.out.println();
				}
			} else {
				for (int j = num1; j <= num2; j++) {
					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d * %d = %2d   ", j, i, j * i);
						if (i % 3 == 0) {
							System.out.println();
						}
					}
					System.out.println();
				}
			}
		}
	}
}
