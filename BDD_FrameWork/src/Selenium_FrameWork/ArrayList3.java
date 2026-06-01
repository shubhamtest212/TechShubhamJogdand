package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {

		// Creating int ArrayLIst
		ArrayList<Integer> inte = new ArrayList<>();

		inte.add(12);
		inte.add(6);
		inte.add(1999);

		System.out.println(inte);

		for (Integer s : inte) {
			System.out.println(s);
		}
	}

}
