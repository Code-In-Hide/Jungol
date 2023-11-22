package Qize.Q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Str = sc.next();
		sc.close();

		//case2
		for (int i = 0; i < Str.length(); i++) {
			char c = Str.charAt(i);
			if ('A' <= c && c <= 'Z') {
				System.out.print(c);
			} else if ('a' <= c && c <= 'z') {
				System.out.print((char)(c - 32));
			}
		}
		//case1
		for (int i = 0; i < Str.length(); i++) {
			char c = Str.charAt(i);
			if (Character.isAlphabetic(c)) {
				System.out.print(Character.toUpperCase(c));
			}
		}
	}
}
