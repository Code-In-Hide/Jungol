package Qize.Q615;

import java.util.Scanner;

class Student {
	private String name;
	private int korScore;
	private int engScore;

	public Student(String name, int korScore, int engScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
	}

	public void print() {
		System.out.println(name + " " + korScore + " " + engScore);
	}

	public void avgprint() {
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String name1 = sc.next();
		cnt++;
		int korScore1 = sc.nextInt();
		int engScore1 = sc.nextInt();

		String name2 = sc.next();
		cnt++;
		int korScore2 = sc.nextInt();
		int engScore2 = sc.nextInt();
		sc.close();

		Student stu1 = new Student(name1, korScore1, engScore1);
		Student stu2 = new Student(name2, korScore2, engScore2);
		stu1.print();
		stu2.print();
		System.out.println("avg " + (korScore1 + korScore2) / cnt + " " + (engScore1 + engScore2) / cnt);
	}
}
