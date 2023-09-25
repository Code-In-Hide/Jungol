package Qize.Q614;

import java.util.Scanner;

class Student {
	private String school;
	private int grade;

	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
		school = "Jejuelementary";
		grade = 6;
		System.out.println(grade + " grade in " + school + " School");
	}
	
	public void print() {
		System.out.println(grade + " grade in " + school + " School");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student stu1 = new Student(school, grade);
		stu1.print();
	}
}
