package Selenium_FrameWork;

public class try_catch__1 {

	public static void main(String[] args) {

		try {
			int a = 10 / 0;
		} catch (ArithmeticException b) {
			b.printStackTrace();
			System.out.println("Here try catch method applicable to handle the error while executing the code");
		} finally {
			System.out.println("If error will handled or not it will execute");
		}

	}

}
