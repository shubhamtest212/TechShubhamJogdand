package Selenium_FrameWork;

public class Array_P {

	public static void main(String[] args) {

		int a[] = new int[10];
		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

			a[0] = 100;
			a[1] = 101;
			a[2] = 102;
			a[3] = 103;
			a[4] = 104;
			a[5] = 105;
			a[6] = 106;
			a[7] = 107;
			a[8] = 108;
			a[9] = 109;

			System.out.println(a[9]);

		}

	}

}
