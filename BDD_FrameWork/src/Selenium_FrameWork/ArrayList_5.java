package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList_5 {

	public static void main(String[] args) {

		// Create ArrayList by using String, Integer and Object

		ArrayList<String> obj1 = new ArrayList<String>();
		ArrayList<Integer> obj2 = new ArrayList<Integer>();
		ArrayList<Object> obj3 = new ArrayList<Object>();

		obj1.add("Selenium");
		obj2.add(8);
		obj3.add("Java");

//		// Print ArrayList
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj3);

		// Print all the elements by using for each loop
		for (String a : obj1) {
			System.out.println(a);
		}

		for (Integer b : obj2) {
			System.out.println(b);
		}

		for (Object c : obj3) {
			System.out.println(c);
		}

	}

}
