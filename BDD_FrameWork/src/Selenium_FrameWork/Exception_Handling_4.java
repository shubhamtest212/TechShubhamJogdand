package Selenium_FrameWork;

public class Exception_Handling_4 {

	public static void main(String[] args) {

		try {
			int i = 20 / 2;
		} finally {
			System.out.println("finally will execute always");

			try {
				int a = 5 / 0;
			} catch (Exception e) {
				e.printStackTrace();

			} finally {
				System.out.println("finally inside finally");
			}
		}

		System.out.println("Exception Handled");
	}

}
