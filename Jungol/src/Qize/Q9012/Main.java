package Qize.Q9012;

public class Main {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		double pie = 3.140000;
		double arg1 = a * b * pie;
		System.out.printf("원주 = %d * %d * %.6f = %.6f%n", a, b, pie, arg1);
		double arg2 = a * a * pie;
		System.out.printf("넓이 = %d * %d * %.6f = %.6f%n", a, a, pie, arg2);
	}
}
