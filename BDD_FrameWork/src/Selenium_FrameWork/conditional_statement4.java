package Selenium_FrameWork;

public class conditional_statement4 {

	public static void main(String[] args) {

		// nested statement

		int age = 28;
		int weight = 50;

		// outer if statement

		if (age < 20) {

			// inner if statement
			if (weight > 50) {
				System.out.println("eligible");
			} else {
				System.out.println("not");
			}
		} else {
			System.out.println("age is less than 20");
		}
	}
}
