package Qize.Q9013;

public class Main {
	public static void main(String[] args) {
		double x = 1.234000;
		double y = 10.34590;

		System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");
		System.out.printf("x =  %.4f\n", x);
		System.out.printf("y = %.4f\n", y);
		System.out.println();
		System.out.println("소수 2자리까지 출력(반올림)");
		System.out.printf("x = %.2f\n", x);
		System.out.printf("y = %.2f\n", y);
	}
}