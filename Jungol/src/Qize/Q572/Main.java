package Qize.Q572;

import java.util.Scanner;

class Rpie {
	public void print(double r) {
		double pie = r * r * 3.14;
		System.out.printf("%.2f", pie);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		Rpie print = new Rpie();
		print.print(r);
	}
}
