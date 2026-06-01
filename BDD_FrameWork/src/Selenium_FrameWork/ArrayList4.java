package Selenium_FrameWork;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {

	public static void main(String[] args) {

		// Create ArrayList
		// In the ArrayList there is no single dimensional or multi-dimensional
		// arraylist concepts

		ArrayList<String> obj = new ArrayList<>();

		obj.add("Selenium");
		obj.add("Java");
		obj.add("Selenium");
		obj.add("Java");
		obj.add("Apple");
		obj.add("Banana");
		obj.addAll(Arrays.asList("Shubham", "Santosh", "Jogdand"));

		System.out.println(obj);

	}

}
