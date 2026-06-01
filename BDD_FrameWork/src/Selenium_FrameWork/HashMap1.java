package Selenium_FrameWork;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMap1 {

	public static void main(String[] args) {

		// HashMap
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put(3, "March");

		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));

		// Hashtable
		Hashtable<Integer, String> hm1 = new Hashtable<>();
		hm1.put(1, "JAN");
		hm1.put(2, "FEB");
		hm1.put(3, "MARCH");
		System.out.println(hm1.get(1));
		System.out.println(hm1.get(2));
		System.out.println(hm1.get(3));
	}

}
