package Qize.Q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int count = 1;

		for (int i = 1; i <= num1; i++) {
			System.out.print(count + " ");
			if (i % 2 != 0) {
				for (int j = 1; j < num2; j++) {
					count++;
					System.out.print(count + " ");
				}
			} else {
				for (int j = 1; j < num2; j++) {
					count--;
					System.out.print(count + " ");
				}
			}
			count += num2;
			System.out.println();
		}
	}
}