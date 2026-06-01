package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		// Creating ArrayList for String datatype
		ArrayList<String> str = new ArrayList<>();

		// Adding String ArrayList
		str.add("QAEngineer");
		str.add("Firstcry.com");

		System.out.println(str);

		for (String s : str) {
			System.out.println("String ArrayList : " + s);
		}

	}

}
