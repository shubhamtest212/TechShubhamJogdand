package Selenium_FrameWork;

public class Conditional_Statements_1 {

	public static void main(String[] args) {

		// if statement
		int a = 15; // Local variable
		if (a > 10) {
			System.out.println("a is greather than 10");
		}

		// if else statement
		int b = 10; // Local variable
		if (b / 2 == 0) {
			System.out.println("Result of b is equal to zero");
		} else {
			System.out.println("Result of b is not equal to zero");
		}

		// if else if ladder statement
		int q = 300; // Local variable
		int w = 300; // Local variable

		if (q < w) {
			System.out.println("q is lesser than w");
		} else if (q == w) {
			System.out.println("q is equal to w");
		} else {
			System.out.println("q is greather than w");
		}

		// Nested if statement
		int age = 26; // Local variable
		int weight = 55; // Local variable

		// outer if statement
		if (age > 18) {

			// Inner if statement
			if (weight == 55) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not eligible");
			}
		} else {
			System.out.println("Age is not greather than 18");
		}

	}

}
