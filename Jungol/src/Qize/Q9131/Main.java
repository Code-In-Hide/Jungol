package Qize.Q9131;

import java.util.Scanner;

class Who {
	private String name;
	private int age;

	public Who(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print1 () {
		System.out.println("친구의 이름 : " + name + ", 나이 : " + age);
	}
	public void print2 () {
		System.out.println("당신의 이름 : " + name + ", 나이 : " + age);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친한 친구의 이름과 나이를 입력하세요. ");
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		Who name_age1 = new Who ("손예준", 12);
		Who name_age2 = new Who (name, age);
		name_age1.print2();
		name_age2.print1();
	}
}
