package Qize.Q9071;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];

		Arrays.sort(ar);

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int max = -10000, min = 10000;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				if (max < ar[i]) {
					max = ar[i];
				}
			} else {
				if (min > ar[i]) {
					min = ar[i];
				}
			}
		}
		System.out.print(min + " " + max);
	}
}
