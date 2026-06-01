package Selenium_FrameWork;

public class array_1 {

	public static void main(String[] args) {

		// Declare an Array
		int a[] = new int[3];

		// Print the length of an Array & length is the property of an Array
		System.out.println(a.length);

		// print the default value of an array integer
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);

		}

		// assign value to an array
		a[0] = 11;
		a[1] = 12;
		a[2] = 13;

		// print the all array elements
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
