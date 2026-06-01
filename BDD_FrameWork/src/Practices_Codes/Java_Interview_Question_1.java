package Practices_Codes;

import java.util.Scanner;

// Write a program to print the reverse of the string input: Nacre output: ercaN

public class Java_Interview_Question_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse : ");

		String str = sc.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}

		sc.close();

	}

}
