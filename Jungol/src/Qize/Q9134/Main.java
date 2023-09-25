package Qize.Q9134;

import java.util.Scanner;

class XY {
	private int x;
	private int y;

	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(x + " " + y);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		System.out.print("점의 좌표는?(x, y) ");
		cnt++;
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("점의 좌표는?(x, y) ");
		cnt++;
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		sc.close();

		XY xy1 = new XY(x1, y1);
		XY xy2 = new XY(x2, y2);
		double xavg = ((double)x1 + x2) / cnt;
		double yavg = ((double)y1 + y2) / cnt;
		System.out.printf("중심점의 위치 = (%.1f, %.1f)",xavg,yavg);
	}
}
