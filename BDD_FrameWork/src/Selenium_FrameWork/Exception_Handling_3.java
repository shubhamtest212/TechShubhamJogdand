package Selenium_FrameWork;

public class Exception_Handling_3 {

	public static void main(String[] args) {

		// Exception handled :
		try {
			int j = 10 / 0;
		} catch (Exception e) {

		} finally {
			System.out.println("finally executed- Exception handled");
		}

		// Exception is not handled : finally block concept - if the exception is
		// handled or not finally will
		// execute always
		try {
			int a = 10 / 0;
		} finally {
			System.out.println("finally executed - Exception not handled");
		}

	}

}
