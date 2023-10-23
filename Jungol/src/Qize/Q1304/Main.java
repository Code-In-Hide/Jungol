package Qize.Q1304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int count = 1;

		for (int i = 1; i <= num; i++) {
			count = i;
			System.out.print(count + " ");
			for (int j = 1; j < num; j++) {
				count += num;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
}
