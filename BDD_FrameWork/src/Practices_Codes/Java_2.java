package Practices_Codes;

import java.util.Arrays;

public class Java_2 {

	public static void main(String[] args) {

		String str1 = "silent";
		String str2 = "listen";

		// step 1 : convert to lowercase
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

		// step 4 : sort array
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		// step 5 : compare arrays
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("This is anagrams");
		} else {
			System.out.println("This is not anagrams");
		}

	}

}
