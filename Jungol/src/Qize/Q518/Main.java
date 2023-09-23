package Qize.Q518;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int a = sc.nextInt();
		cnt++;
		int b = sc.nextInt();
		cnt++;
		int c = sc.nextInt();
		cnt++;
		sc.close();

		int sum = a + b + c;
		int avg = sum / cnt;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
