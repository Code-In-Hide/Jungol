package Qize.Q9130;

import java.util.Scanner;

class Who{
	private String name;
	private int age;
	
	public Who(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "세이군요.");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = sc.next();
		System.out.print("당신의 나이는 몇 살입니까? ");
		int age = sc.nextInt();
		sc.close();
		
		Who Whois = new Who(name,age);
		Whois.print();
	}
}
