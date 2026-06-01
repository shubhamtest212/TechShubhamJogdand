package Selenium_FrameWork;

public class TestArray3 {

	public static void main(String[] args) {

		int a[] = new int[2];
		System.out.println(a.length);

		for (int element : a) {
			System.out.println(element);
		}

		a[0] = 1;
		a[1] = 2;
		System.out.println(a[1]);

		for (int element : a) {
			System.out.println(element);
		}
	}

}
