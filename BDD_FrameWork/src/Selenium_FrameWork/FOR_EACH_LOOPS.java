package Selenium_FrameWork;

import java.util.ArrayList;

public class FOR_EACH_LOOPS {

	public static void main(String[] args) {

		// For each loop for Object type
		ArrayList<Object> obj = new ArrayList<>();

		obj.add("Selenium");
		obj.add("Automation");
		obj.add("Java");
		obj.add("TypeScript");
		obj.add("PlayWright");

		System.out.println(obj);

		for (Object VK : obj) {
			System.out.println(VK);
		}

	}

}
