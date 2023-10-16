package Qize.Q9035;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 수를 입력하세요. ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();

		if (num1 > num2 && num1 > num3) {
			System.out.println("입력받은 수중 가장 큰 수는 " + num1 + "입니다.");
		} else if (num2 > num3) {
			System.out.println("입력받은 수중 가장 큰 수는 " + num2 + "입니다.");
		} else {
			System.out.println("입력받은 수중 가장 큰 수는 " + num3 + "입니다.");
		}
	}
}