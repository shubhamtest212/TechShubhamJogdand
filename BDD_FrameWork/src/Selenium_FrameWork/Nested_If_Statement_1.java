package Selenium_FrameWork;

public class Nested_If_Statement_1 {

	public static void main(String[] args) {

		// Nested if statement

		int age = 26; // Local variable
		int weight = 55; // Local variable

		if (age == 26) {

			if (weight > 50) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not eligible");
			}
		} else {
			System.out.println("Age is less than 26");
		}

	}

}
