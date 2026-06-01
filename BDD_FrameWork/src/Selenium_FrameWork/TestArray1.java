package Selenium_FrameWork;

public class TestArray1 {

	public static void main(String[] args) {

		// Declare An Array
		int a[] = new int[5];

		// Print the length of an Array
		System.out.println(a.length); // length is a property of an Array

		// Print the default value of an integer array
		for (int element : a) {
			System.out.println(element);
		}

		// Assign value to an Array
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		System.out.println(a[4]);

		// Print all array elements
		for (int element : a) {
			System.out.println(element);
		}

	}

}
