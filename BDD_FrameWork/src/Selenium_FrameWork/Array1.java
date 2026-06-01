package Selenium_FrameWork;

public class Array1 {

	static int c[] = { 22, 2, 44, 5 };

	public static void main(String[] args) {

		int b = c[0];

		for (int element : c) {
			if (b > element) {
				System.out.println(b);
			} else {
				System.out.println("ABCD");
			}

		}

	}

}
