package Selenium_FrameWork;

public class FOR_EACH_LOOP1 {

	public static void main(String[] args) {

		// For each loop- Only use for Array Traversing
		Object a[] = { "Selenium", "QAEngineer", 12, 6, 1999, 26 > 27, 'c' };

		System.out.println(a.length);
		System.out.println(a[3]);

		for (Object o : a) {
			System.out.println(o);
		}

	}

}
