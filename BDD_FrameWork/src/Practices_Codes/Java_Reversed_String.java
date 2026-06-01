package Practices_Codes;

import java.util.Scanner;

public class Java_Reversed_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		sc.close();

	}

}
