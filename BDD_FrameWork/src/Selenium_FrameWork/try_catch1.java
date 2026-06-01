package Selenium_FrameWork;

public class try_catch1 {

	public static void main(String[] args) {

		try {
			int a = 5 / 0;
		} catch (ArithmeticException a) {
			a.printStackTrace();
			System.out.println("Exception Handled");
		} finally {
			System.out.println("finally will execute if the exception is handled or not");
		}

	}

}
