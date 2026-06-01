package Selenium_FrameWork;

import java.util.Hashtable;

public class Hashtable_1 {

	public static void main(String[] args) {

		// Hashtable
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();

		ht1.put(1, "shubham");
		ht1.put(2, "santosh");
		ht1.put(3, "jogdand");

		System.out.println(ht1.size());

		System.out.println(ht1.get(1));
		System.out.println(ht1.get(2));
		System.out.println(ht1.get(3));

	}

}
