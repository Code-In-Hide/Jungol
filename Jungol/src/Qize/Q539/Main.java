package Qize.Q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;

		while (true) {
			int inp = sc.nextInt();

			if (inp < 100) {
				sum += inp;
				cnt++;
			} else if (inp >= 100) {
				sum += inp;
				cnt++;
				System.out.println(sum);
				System.out.printf("%.1f\n", (double) sum / cnt);
				break;
			}
		}
		sc.close();
	}
}

/*
 * 선생님 코드
 * import java.util.Scanner;
 * 
 * public class Main { public static void main(String[] args) { Scanner sc = new
 * Scanner(System.in); int sum = 0; int cnt = 0;
 * 
 * while (true) { int inp = sc.nextInt(); sum += inp; cnt++;
 * 
 * if (inp >= 100) { System.out.println(sum); System.out.printf("%.1f\n",
 * (double)sum / cnt); break; } } sc.close(); } }
 */
