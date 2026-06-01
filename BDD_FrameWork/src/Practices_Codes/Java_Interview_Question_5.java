package Practices_Codes;

import java.util.Scanner;

// write a program to check whether the given string contains digits or not

public class Java_Interview_Question_5 {

	public static String checkDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				return "Given string contains Digits";
			}
		}

		return "Given string not contains Digits";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");

		String str = sc.nextLine();

		System.out.println(checkDigit(str));
		sc.close();
	}

}
