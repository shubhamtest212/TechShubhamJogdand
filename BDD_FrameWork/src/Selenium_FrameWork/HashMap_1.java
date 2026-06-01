package Selenium_FrameWork;

import java.util.HashMap;

public class HashMap_1 {

	public static void main(String[] args) {

		// HashMap Object- non synchronized means faster execution
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.put(1, "Shubham");
		hm1.put(2, "Santosh");
		hm1.put(3, "Jogdand");

		System.out.println(hm1.size());

		System.out.println(hm1.get(1));
		System.out.println(hm1.get(2));
		System.out.println(hm1.get(3));

	}

}
