package Qize.Q534;

import java.util.Scanner;

public class Main_switch {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String b = a.next();
		switch (b) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		case "F":
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;
		}
		
	}
}
