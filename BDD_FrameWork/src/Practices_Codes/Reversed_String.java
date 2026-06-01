package Practices_Codes;

// write a program to reverse string without using inbuilt functions

public class Reversed_String {

	public static void main(String[] args) {

		String str = "Selenium";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("Reversed String : " + rev);

	}

}
