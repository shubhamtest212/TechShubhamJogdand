package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {

		// create ArrayList
		ArrayList<Object> obj1 = new ArrayList<>();

		// Adding ArrayList object
		obj1.add(12);
		obj1.add(6);
		obj1.add(1999);

		System.out.println(obj1.size());

		for (Object a : obj1) {
			System.out.println(a);
		}

	}

}
