package Selenium_FrameWork;

public class Reverse_a_String_1 {

	public static void main(String[] args) {

		String str = "Selenium";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--)
			rev += str.charAt(i);
		System.out.println(rev);
	}

}

// This code is written for reverse the string
