package Qize.Q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int inp = sc.nextInt();
		int sum = 0;
		
		int i = 0;
		if (inp <= 100) {
			while(i <= inp) {
				sum += i;
				i++;
			}
			System.out.println(sum);
		}
	}
}
