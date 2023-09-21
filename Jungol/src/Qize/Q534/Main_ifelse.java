package Qize.Q534;

import java.util.Scanner;

public class Main_ifelse {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String b = a.next();

		if ("A".equals(b)) {System.out.println("Excellent");} 
		else if ("B".equals(b)) {System.out.println("Good");}
		else if ("C".equals(b)) {System.out.println("Usually");}
		else if ("D".equals(b)) {System.out.println("Effort");}
		else if ("F".equals(b)) {System.out.println("Failure");}
		else System.out.println("error");
	}
}
