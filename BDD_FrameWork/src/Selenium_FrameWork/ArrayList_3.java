package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList_3 {

	// Array vs ArrayList
	// Array size is fixed
	// ArrayList size is dynamic
	// ArrayList size can grow dynamically

	public static void main(String[] args) {

		// Create ArrayList
		ArrayList<Object> obj = new ArrayList<Object>();

		// Adding object in ArrayList
		obj.add(1);
		obj.add("Selenium");
		obj.add(7.0);
		obj.add('a');
		obj.add(3 > 12);

		System.out.println(obj.indexOf(1));

		// Print ArrayList Element using for each loop
		for (Object b : obj) {
			System.out.println("for each loop : " + b);
		}

	}

}
