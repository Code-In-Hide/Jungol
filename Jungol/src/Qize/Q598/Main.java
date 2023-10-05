package Qize.Q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char a = sc.next().charAt(0);
			int b = (int) a;

			if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
				System.out.println(a);
			} else if (a >= 48 && a <= 57) {
				System.out.println(b);
			} else {
				break;
			}
		}
		sc.close();
	}
}