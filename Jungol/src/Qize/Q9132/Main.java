package Qize.Q9132;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

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
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		int korScore1 = sc.nextInt();
		int engScore1 = sc.nextInt();

		String name2 = sc.next();
		int korScore2 = sc.nextInt();
		int engScore2 = sc.nextInt();

		Student stu1 = new Student(name1, korScore1, engScore1);
		Student stu2 = new Student(name2, korScore2, engScore2);
		stu1.print();
		stu2.print();
		System.out.println("합계 " + (korScore1 + korScore2) + " " + (engScore1 + engScore2));
	}
}
