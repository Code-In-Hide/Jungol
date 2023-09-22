package Qize.Q513;

public class Main {
	public static void main(String[] args) {
		double yd = 2.1;
		double in = 10.5;

		double cm1 = yd * 91.44;
		double cm2 = in * 2.54;
		System.out.printf(" %.1fyd = %.1fcm\n", yd, cm1);
		System.out.printf("%.1fin =  %.1fcm", in, cm2);

	}
}
