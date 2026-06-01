package Selenium_FrameWork;

import java.util.Arrays;

public class AnagramCheck_4 {

	public static void main(String[] args) {

		String str1 = "SILENT";
		String str2 = "LISTEN";

		// step 1 : Convert to lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// step 2 : check length
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
			return;
		}

		// step 3 : convert to char array
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		// step 4 : sort the arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// step 5 : compare arrays
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

	}

}
