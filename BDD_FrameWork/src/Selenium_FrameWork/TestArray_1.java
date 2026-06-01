package Selenium_FrameWork;

public class TestArray_1 {

	public static void main(String[] args) {

		// Declare an Array

		int a[] = new int[10];

		System.out.println(a.length);

		for (int webElement : a) {
			System.out.println(webElement);
		}

		// Assign value to an Array
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;

//		System.out.println(a[0]);

		for (int element : a) {
			System.out.println(element);
		}

	}

}
