package Selenium_FrameWork;

public class Conditional_Statement_if_else_nested_statement_8 {

	public static void main(String[] args) {

		// Nested statement

		int age = 25;
		int weight = 55;

		// Outer if statement
		if (age < 18) {

			// Inner if statement
			if (weight > 50) {
				System.out.println("Eligible");
			} else {
				System.out.println("not eligible");
			}
		} else {
			System.out.println("age is not greather than 18 ");
		}

	}

}

// if the Outer statement is true then Inner if statement will execute otherwise not
