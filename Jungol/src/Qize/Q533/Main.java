package Qize.Q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String se = sc.next();
		int age = sc.nextInt();
		
		if (se.equals("M")) {
			if(age > 20) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else if(age > 20) {
			System.out.println("WOMAN");
		} else {
			System.out.println("GIRL");
		}
	}
}
