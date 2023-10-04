package Qize.Q120;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 1
		if (a < b) {
			System.out.println(b - a);
		} else {
			System.out.println(a - b);
		}

		// 2 (절대값을 이용한 계산)
		System.out.println(Math.abs(a - b));

		// 3 (입력받은 수중에서 가장 큰수를 찾고 입력받은 수중에서 가장 작은수를 찾아서 계산)
		System.out.println(Math.max(a, b) - Math.min(a, b));
	}
}