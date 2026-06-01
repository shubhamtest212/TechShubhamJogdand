package Practices_Codes;

import java.util.Scanner;

public class Reversed_String_By_Using_StringBuilder1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reversed : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
		sc.close();

	}

}
