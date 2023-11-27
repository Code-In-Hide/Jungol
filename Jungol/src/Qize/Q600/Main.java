package Qize.Q600;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Str = sc.nextLine();
		sc.close();
		
		String [] Strspl = Str.split(" ");
		
		System.out.println(Strspl.length);
	}
}
