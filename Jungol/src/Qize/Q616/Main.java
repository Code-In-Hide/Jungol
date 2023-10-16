package Qize.Q616;

import java.util.Scanner;

class Xy {
	private double x1, y1, x2, y2, x3, y3;

	public Xy(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	public void print() {
		double xarg = (x1 + x2 + x3)/3;
		double yarg = (y1 + y2 + y3)/3;
		System.out.printf("(%.1f, %.1f)", xarg, yarg);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextInt();
		double y1 = sc.nextInt();
		double x2 = sc.nextInt();
		double y2 = sc.nextInt();
		double x3 = sc.nextInt();
		double y3 = sc.nextInt();
		sc.close();
		
		Xy xyarg = new Xy(x1,y1,x2,y2,x3,y3);
		xyarg.print();
	}
}
