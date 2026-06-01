package Selenium_FrameWork;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable1 = new Hashtable<>();
		hashtable1.put(1, "shubham");
		hashtable1.put(2, "santosh");
		hashtable1.put(3, "jogdand");
		hashtable1.put(4, "Master of Computer Application");
		hashtable1.put(5, "An SDET Engineer");
		hashtable1.put(6, "Current package is more than 8.5LPA");
		System.out.println(hashtable1.get(1));
		System.out.println(hashtable1.get(2));
		System.out.println(hashtable1.get(3));
		System.out.println(hashtable1.get(4));
		System.out.println(hashtable1.get(5));
		System.out.println(hashtable1.get(6));

	}

}
