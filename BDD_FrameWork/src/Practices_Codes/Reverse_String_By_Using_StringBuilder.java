package Practices_Codes;

import java.util.Scanner;

public class Reverse_String_By_Using_StringBuilder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		sc.close();

	}

}
