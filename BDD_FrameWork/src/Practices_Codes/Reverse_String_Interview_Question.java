package Practices_Codes;

import java.util.Scanner;;

public class Reverse_String_Interview_Question {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse: ");

		String str = sc.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		sc.close();

	}

}
