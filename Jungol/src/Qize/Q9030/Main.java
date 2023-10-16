package Qize.Q9030;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a > 10) {
			System.out.println(a);
			System.out.println("10보다 큰 수를 입력하셨습니다.");
		}
	}
}
