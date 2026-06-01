package Practices_Codes;

public class Java_6 {

	public static void main(String[] args) {

		String str = "Selenium";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) 
			rev += str.charAt(i);
			System.out.println(rev);
		}

	}



// This code is written for reversing the string
