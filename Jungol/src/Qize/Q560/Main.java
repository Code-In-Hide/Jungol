package Qize.Q560;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] ar = new int [10];
		
		for (int i = 0; i < 10; i++) {
			ar[i] = sc.nextInt();
			
		}
		Arrays.sort(ar);
		System.out.println(ar[0]);
		
		sc.close();
	}
}
