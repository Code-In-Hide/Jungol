package Qize.Q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = new char[10];
		for (int i = 0; i <= a.length; i++) {
			a[i] = sc.next().charAt(0);
			if (i % 3 == 0 && i <= 9) {
				System.out.print(a[i] + " ");
				
			}else if(i == 8){
				break;
			}
		}
	}
}