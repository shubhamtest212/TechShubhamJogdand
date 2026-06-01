package Selenium_FrameWork;

public class break_statement_2 {

	public static void main(String[] args) {

		// BREAK STATEMENT BY USING WHILE LOOP

		int j = 1;
		while (j < 5) {
			if (j == 3) {
				break;
			}
			System.out.println(j);
			j++;
		}
		System.out.println("end for while loop by using break statement");

	}
}
