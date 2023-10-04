package Qize.Q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cunt1 = 0;
		int cunt2 = 0;

		while (true) {
			int a = sc.nextInt();
			if (a == 0) {
				break;
			} else if (a % 2 == 0) {
				cunt2++;
			} else if (a % 2 != 0) {
				cunt1++;
			}
		}
		System.out.println("odd : " + cunt1);
		System.out.println("even : " + cunt2);
		sc.close();
	}
}
