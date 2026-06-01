package Selenium_FrameWork;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {

		// HashMap

		HashMap<String, String> HM1 = new HashMap<>();
		HM1.put("NAME", "SHUBHAM");
		HM1.put("SURNAME", "JOGDAND");
		System.out.println(HM1.get("NAME"));
		System.out.println(HM1.get("SURNAME"));

	}

}

// HASHMAP SYNTAX- HashMap<String, String> HM1 = new HashMap<String, String>();
// HASHTABLE SYNTAX- Hashtable<Integer, String> hmm = new Hashtable<Integer, String>();
// This concept is depends on put the data and get the data as per key
// HashMap- is non-synchronized
// Hashtable - is synchronized
// Both concept are used to map the data