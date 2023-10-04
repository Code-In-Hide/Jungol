package Qize.Q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (true) {
			int a = sc.nextInt();
			if (a > 100 || a < 0) {
				break;
			} else {
				sum += a;
				count++;
			}
		}
		sc.close();
		double avg = (double) sum / count;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}
}
 