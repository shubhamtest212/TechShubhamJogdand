package Selenium_FrameWork;

public class Exception_Handling_2 {

	public static void main(String[] args) {

		// Handling null pointer exception
		String s = null;
		try {
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println("NullPointerException Handled");
		}

		// Handling Number format exception
		String t = "selenium";
		try {
			int i = Integer.parseInt(t);
		} catch (NumberFormatException n) {
			System.out.println("NumberFormatException Handled");

		}

		// Handling ArrayIndexOutOfBoundException
		int a[] = new int[5];
		try {
			a[7] = 50;
		} catch (Exception x) {
			System.out.println("ArrayIndexOutOfBoundsException Handled");

		}
	}

}
