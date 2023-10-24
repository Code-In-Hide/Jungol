package Qize.Q617;

import java.util.Scanner;

class Info {
	private String name;
	private int height;

	public Info(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getheight() {
		return height;
	}

	public void print() {
		System.out.println(name + " " + height);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Info[] info = new Info[5];

		for (int i = 0; i < info.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			info[i] = new Info(name, height);
		}

		Info min = new Info("", 200);
		for (int i = 0; i < info.length; i++) {
			if (min.getheight() > info[i].getheight()) {
				min = info[i];
			}
		}
		min.print();
		sc.close();
	}
}
