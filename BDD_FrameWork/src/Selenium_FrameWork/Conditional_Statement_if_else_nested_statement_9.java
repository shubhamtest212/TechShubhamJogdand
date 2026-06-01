package Selenium_FrameWork;

public class Conditional_Statement_if_else_nested_statement_9 {

	public static void main(String[] args) {

		int age = 18;
		int weight = 20;

		// Outer if statement

		if (age == 18) {

			// Inner if statement
			if (weight == 20) {
				System.out.println("weight is equal to given ");
			} else {
				System.out.println("weight is not equal to ");
			}
		} else {
			System.out.println("age is not equal to");
		}

	}

}
