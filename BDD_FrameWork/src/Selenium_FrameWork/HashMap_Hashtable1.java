package Selenium_FrameWork;

import java.util.HashMap;

public class HashMap_Hashtable1 {

	public static void main(String[] args) {

		// Hashmap-non synchronized- fast execution
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		hm1.put(1, "SHUBHAM");
		hm1.put(2, "JOGDAND");

		System.out.println(hm1.get(1));
		System.out.println(hm1.get(2));

		System.out.println(hm1.size());

	}

}
