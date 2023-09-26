package Qize.Q105;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###,###");

		String Seoul1 = df.format(10312545);
		String Seoul2 = df.format(91375);
		String Seoul3 = "+" + Seoul2;
		System.out.printf("%15s%15s%15s\n", "Seoul", Seoul1, Seoul3);

		String Pusan1 = df.format(3567910);
		String Pusan2 = df.format(5868);
		String Pusan3 = "+" + Pusan2;
		System.out.printf("%15s%15s%15s\n", "Pusan", Pusan1, Pusan3);

		String Incheon1 = df.format(2758296);
		String Incheon2 = df.format(64888);
		String Incheon3 = "+" + Incheon2;
		System.out.printf("%15s%15s%15s\n", "Incheon", Incheon1, Incheon3);

		String Deagu1 = df.format(2511676);
		String Deagu2 = df.format(17230);
		String Deagu3 = "+" + Deagu2;
		System.out.printf("%15s%15s%15s\n", "Daegu", Deagu1, Deagu3);

		String Gwangju1 = df.format(1454636);
		String Gwangju2 = df.format(29774);
		String Gwangju3 = "+" + Gwangju2;
		System.out.printf("%15s%15s%15s\n", "Gwangju", Gwangju1, Gwangju3);
	}
}
