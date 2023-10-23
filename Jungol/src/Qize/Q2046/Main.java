package Qize.Q2046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int count = 1;

		switch (num2) {
		case 1: {
			for (int i = 1; i <= num1; i++) {
				for (int j = 0; j < num1; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;
		}

		case 2: {
			for (int i = count; i <= num1; i++) {
				for (int j = 0; j < num1; j++) {
					if (i % 2 != 0) {
						System.out.print(count + " ");
						count++;
					} else {
						count--;
						System.out.print(count + " ");
					}
				}
				System.out.println();
			}
			break;
		}

		case 3: {
			for (int i = count; i <= num1; i++) {
				count = i;
				for (int j = 0; j < num1; j++) {
					System.out.print(count + " ");
					count += i;
				}
				System.out.println();
			}
			break;
		}
		}
	}
}
