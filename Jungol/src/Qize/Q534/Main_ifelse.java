package Qize.Q534;

import java.util.Scanner;

public class Main_ifelse {
	public static void main(String[] args) {
		
		//'' char 로 문제 풀이
		/*Scanner a = new Scanner(System.in);
		char b = a.next().charAt(0);
		a.close();

		if (b == 'A') {System.out.println("Excellent");} 
		else if (b == 'B') {System.out.println("Good");}
		else if (b == 'C') {System.out.println("Usually");}
		else if (b == 'D') {System.out.println("Effort");}
		else if (b == 'F') {System.out.println("Failure");}
		else System.out.println("error"); */
		
		//"" String 로 문제 풀이
		Scanner a = new Scanner(System.in);
		String b= a.next();
		a.close();
		
		System.out.println(b);
		if(b.equals("A")) {
			System.out.println("Excellent");
		}else if (b.equals("B")) {
			System.out.println("Good");
		}else if (b.equals("C")) {
			System.out.println("Usually");
		}else if (b.equals("D")) {
			System.out.println("Effort");
		}else if (b.equals("F")) {
			System.out.println("Failure");
		}else 
			System.out.println("error");
	}
}
