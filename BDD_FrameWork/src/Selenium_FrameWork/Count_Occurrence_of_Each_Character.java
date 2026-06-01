package Selenium_FrameWork;

import java.util.HashMap;

public class Count_Occurrence_of_Each_Character {

	// Count Occurrence of Each Character
	// by using HashMap

	public static void main(String[] args) {

		String str = "automation";
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map);
	}

}
