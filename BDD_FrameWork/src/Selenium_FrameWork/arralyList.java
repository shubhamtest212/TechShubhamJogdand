package Selenium_FrameWork;

import java.util.ArrayList;

public class arralyList {

	public static void main(String[] args) {

		// ArrayList Object
		ArrayList<Object> arr1 = new ArrayList<>();

		arr1.add("SHUBHAM");
		arr1.add("SANTOSH");
		arr1.add("JOGDAND");

		System.out.println(arr1.size());

		for (Object xyz : arr1) {

			System.out.println(xyz);
		}

	}

}
