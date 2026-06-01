package Selenium_FrameWork;

public class Conditional_Statement_if_else_nested_statement_10 {

	public static void main(String[] args) {

		int age = 25;
		int weight = 61;

		// Outer if statement

		if (age > 18) {

			// Inner if statement

			if (weight > 60) {
				System.out.println("Eligible");
			} else {
				System.out.println("not eligible");
			}

		} else {
			System.out.println("age is not greather than 18");
		}

	}

}
