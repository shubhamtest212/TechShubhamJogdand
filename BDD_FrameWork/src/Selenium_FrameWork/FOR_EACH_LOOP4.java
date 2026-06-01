package Selenium_FrameWork;

import java.util.ArrayList;

public class FOR_EACH_LOOP4 {

	public static void main(String[] args) {

		// ArrayList for int
		ArrayList<Integer> abc = new ArrayList<>();

		// Adding runtime arraylist
		abc.add(1);
		abc.add(2);
		abc.add(3);
		abc.add(4);
		abc.add(5);
		abc.add(6);
		abc.add(7);
		abc.add(8);
		abc.add(9);
		abc.add(10);

		System.out.println(abc);

		for (Integer s : abc) {
			System.out.println(s);
		}
		System.out.println("for each loop for array traversing");

	}

}
