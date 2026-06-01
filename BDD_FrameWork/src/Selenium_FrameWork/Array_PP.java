package Selenium_FrameWork;

public class Array_PP {

	public static void main(String[] args) {

		String a[] = new String[5];

		System.out.println(a.length);

		for (String element : a) {
			System.out.println(element);
		}

		a[0] = "a";
		a[1] = "b";
		a[2] = "c";
		a[3] = "d";
		a[4] = "e";

		System.out.println(a[4]);
	}

}
