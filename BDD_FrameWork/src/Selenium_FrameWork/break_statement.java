package Selenium_FrameWork;

public class break_statement {

	public static void main(String[] args) {

		// using for loop
		for (int i = 1; i < 5; i++) {
			// if statement
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("END OF FOR LOOP");
	}

}
