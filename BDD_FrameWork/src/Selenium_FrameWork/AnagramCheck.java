package Selenium_FrameWork;

import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args) {

		String str1 = "silent";
		String str2 = "listen";

		// Step 1: Convert to lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Step 2: Check length
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
			return;
		}

		// Step 3: Convert to char array
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		// Step 4: Sort arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Step 5: Compare arrays
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}
}