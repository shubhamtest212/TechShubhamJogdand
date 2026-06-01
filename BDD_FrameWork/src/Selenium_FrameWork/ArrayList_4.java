package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList_4 {

	public static void main(String[] args) {

		// Create ArrayList
		ArrayList<String> obj = new ArrayList<>();

		obj.add("selenium");
		obj.add("Java");
		obj.add("API");
		obj.add("AGILE");
		obj.add("Playwright");
		obj.add("TypeScript");

		System.out.println("ArrayList Size : " + obj);

		// Print all elements by using for each loop

		for (String c : obj) {
			if (obj.contains("AGILE")) {
				System.out.println(c);

			}

		}
	}

}
