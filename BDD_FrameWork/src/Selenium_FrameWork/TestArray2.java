package Selenium_FrameWork;

public class TestArray2 {

	public static void main(String[] args) {

		// Array
		int b[] = new int[10];

		System.out.println(b.length);

		for (int element : b) {
			System.out.println(element);
		}

		b[0] = 100;
		b[1] = 101;
		b[2] = 102;
		b[3] = 103;
		b[4] = 104;
		b[5] = 105;
		b[6] = 106;
		b[7] = 107;
		b[8] = 108;
		b[9] = 109;

		System.out.println(b[9]);

		for (int element : b) {
			System.out.println(element);
		}

	}

}
