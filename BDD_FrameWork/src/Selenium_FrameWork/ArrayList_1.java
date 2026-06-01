package Selenium_FrameWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_1 {

	public static void main(String[] args) {

		// create ArrayList
		ArrayList<Object> obj = new ArrayList<>();

		// Adding Object in ArrayList
		obj.add("shubham");
		obj.add("1261999");
		obj.add("santosh");
		obj.add(887766);
		obj.add("jogdand");
		obj.add(Arrays.asList(99, 100, "Selenium", "Automation", "API", "Playwright"));

		// print ArrayList all elements
		System.out.println(obj);

		// print ArrayList element using for each loop
		for (Object j : obj) {
			System.out.println("for each loop :" + j);

		}

	}
}
