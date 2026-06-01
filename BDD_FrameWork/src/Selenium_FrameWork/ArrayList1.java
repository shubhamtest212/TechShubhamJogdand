package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		// Creating ArrayList object
		ArrayList<Object> obj = new ArrayList<>();

		// Adding ArrayList Object
		obj.add("SHUBHAM");
		obj.add("JOGDAND");
		obj.add(12);
		obj.add(1999);
		obj.add(26 == 27);
		obj.add(26 == 26);

		// Print all arraylist object elements
		System.out.println(obj);

		// for each loop
		for (Object s : obj) {
			System.out.println("for each loop : " + s);
		}

	}

}
