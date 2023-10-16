package Qize.Q9031;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
		System.out.println("입력받은 수 중 큰 수는 " + num1 + "이고 작은 수는 " + num2 + "입니다.");	
		} else {
			System.out.println("입력받은 수 중 큰 수는 " + num2 + "이고 작은 수는 " + num1 + "입니다.");
		}
		sc.close();
	}
}
