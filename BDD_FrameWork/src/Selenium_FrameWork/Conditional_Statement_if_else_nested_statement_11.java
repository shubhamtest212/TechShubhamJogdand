package Selenium_FrameWork;

public class Conditional_Statement_if_else_nested_statement_11 {

	public static void main(String[] args) {

		int age = 20;
		int weight = 50;

		// Outer if statement

		if (age > 18) {

			// Inner if statement
			if (weight > 45) {
				System.out.println("eligible");
			} else {
				System.out.println("not eligible");
			}
		} else {
			System.out.println(" age is not greather than 20");
		}

	}

}
