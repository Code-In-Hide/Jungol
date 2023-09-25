package Qize.Q614;

import java.util.Scanner;

class Student {
	private String school;
	private int grade;

	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(this.grade + " grade in " + this.school + " School");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student stu1 = new Student("Jejuelementary", 6);
		Student stu2 = new Student(school, grade);
		stu1.print();
		stu2.print();
	}
}
