package Qize.Q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double Class [] = new double[] {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		System.out.println(Class[a-1] + Class[b-1]);
		sc.close();
	}
}