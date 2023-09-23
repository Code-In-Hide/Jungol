package Qize.Q518;

import java.util.Scanner;

public class NewMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열 생성
		int a = sc.nextInt();
		int[] ar = new int[a];

		// 생성된 배열에 개수만큼 정수 대입
		for (int i = 0; i < a; i++) {
			ar[i] = sc.nextInt();
		}
		// 합계 계산
		int sum = 0; // 합계를 저장할 변수를 초기화
		for (int i = 0; i < a; i++) {
			sum += ar[i]; // 각 정수를 합계에 더함
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum / a);
		sc.close();
	}
}