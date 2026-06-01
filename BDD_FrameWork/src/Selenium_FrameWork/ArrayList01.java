package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {

		// Create ArrayList
		ArrayList<Object> obj = new ArrayList<>();

		obj.add("SHUBHAM");
		obj.add("JOGDAND");

		System.out.println(obj.size());

		for (Object x : obj) {
			System.out.println(x);
		}

	}

}
