package Qize.Q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int max = 0;
		int min = 9999;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] < 100 && num[i] > max) {
				max = num[i];
			}

			if (num[i] > 100 && num[i] < min) {
				min = num[i];
			}
		}
		
		if (min == 9999) {
			min = 100;
		}
		if (max == 0) {
			max = 100;
		}
			System.out.println(max + " " + min);
		sc.close();
	}
}
