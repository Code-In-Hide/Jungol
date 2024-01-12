package Qize.Q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			String loop = str.substring(str.length()-1); // str문자열의 마지막 문자를 추출
			str = loop + str.substring(0, str.length()-1); // str문자열의 마지막 문자를 추출(loop) + str의 마지막문자를제외한 나머지를 그대로 붙여넣기
			System.out.println(str);
		}
		sc.close();
	}
}