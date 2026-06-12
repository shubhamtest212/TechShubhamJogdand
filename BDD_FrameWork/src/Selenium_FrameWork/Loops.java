package Selenium_FrameWork;

public class Loops {

	public static void main(String[] args) {

		// for loop
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

		}

		System.out.println("Control came out from loop");

		// for each loop- for array traversing
		Object a[] = { "Selenium", 10.5, 3 > 12, 'c', 5 };

		// Print an array using for each loop
		for (Object b : a) {
			System.out.println(b);
		}

	}

}
