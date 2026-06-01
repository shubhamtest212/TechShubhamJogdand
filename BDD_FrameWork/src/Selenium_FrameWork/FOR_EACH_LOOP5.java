package Selenium_FrameWork;

import java.util.ArrayList;

public class FOR_EACH_LOOP5 {

	public static void main(String[] args) {

		// String ArrayList
		ArrayList<String> str = new ArrayList<>();

		str.add("selenium");
		str.add("Automation");
		str.add("API");
		str.add("JAVA");

		for (String king : str) {
			System.out.println(king);

		}
		System.out.println("FOR EACH LOOP FINISHED HERE");

	}

}
