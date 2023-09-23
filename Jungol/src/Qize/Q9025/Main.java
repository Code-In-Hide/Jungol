package Qize.Q9025;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 2;

		// a와 b가 모두 참인지 확인
		int result1 = (a != 0 && b != 0) ? 1 : 0;
		// a 또는 b 가 참인지 확인
		int result2 = (a != 0 || b != 0) ? 1 : 0;
		// b와 c가 모두 참인지 확인
		int result3 = (b != 0 && c != 0) ? 1 : 0;
		// a가 참이 아닌지 확인
		int result4 = (a == 0) ? 1 : 0;

		System.out.print(result1);
		System.out.print(" " + result2);
		System.out.print(" " + result3);
		System.out.print(" " + result4);
	}
}
