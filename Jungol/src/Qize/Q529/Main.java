package Qize.Q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int wight = sc.nextInt();
		int hight = sc.nextInt();
		sc.close();
		
		System.out.println(hight + 100 - wight);
		if (hight + 100 - wight > 0) {
			System.out.println("Obesity");
		}
	}
}
