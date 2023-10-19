package Qize.Q1291;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int fnum = sc.nextInt();
			int nnum = sc.nextInt();
			if (fnum > 1 && fnum < 10 && nnum < 10 && nnum > 1) {
				if (fnum < nnum) {
					for (int i = 1; i <= 9; i++) {
						for (int j = fnum; j <= nnum; j++) {
							System.out.printf("%d * %d =%3d   ", j, i, j * i);
						}
						System.out.println();
					}
				} else {
						for (int i = 1; i <= 9; i++) {
							for (int j = fnum; j >= nnum; j--) {
								System.out.printf("%d * %d =%3d   ", j, i, j * i);
							}
							System.out.println();
						}
				}
				sc.close();
				break;
			} else {
				System.out.println("INPUT ERROR!");
			}
		}
	}
}
