package Selenium_FrameWork;

import java.util.Hashtable;

public class HashTable_1 {

	public static void main(String[] args) {

		// Hashtable1 - synchronized slow execution

		Hashtable<Integer, String> hm2 = new Hashtable<Integer, String>();

		hm2.put(1, "shubham");
		hm2.put(2, "santosh");
		hm2.put(3, "jogdand");

		System.out.println(hm2.size());

		System.out.println(hm2.get(1));
		System.out.println(hm2.get(2));
		System.out.println(hm2.get(3));

	}

}
