package Qize.Q9022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = ++a + b--;

		System.out.print("a = " + a); // 전치 연산자
		System.out.print(", b = " + b); // 후치 연산자
		System.out.print(", c = " + c);
	}
}