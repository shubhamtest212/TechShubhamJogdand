package Selenium_FrameWork;

import java.util.HashMap;

public class HashMap3 {

	public static void main(String[] args) {

		// HashMap
		HashMap<Integer, Character> hm1 = new HashMap<>();
		hm1.put(1, 's');
		hm1.put(2, 's');
		hm1.put(3, 'j');

		System.out.println(hm1.get(1));
		System.out.println(hm1.get(2));
		System.out.println(hm1.get(3));

	}

}
