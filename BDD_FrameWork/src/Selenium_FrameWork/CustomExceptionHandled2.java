package Selenium_FrameWork;

import java.util.Scanner;

// throw is used to handled single exception
// throws is used to handled multiple exception

public class CustomExceptionHandled2 {

	public static void e(int age) throws Exception {

		try {
			if (age < 21) {
				throw new CustomException2("your are not eligible");
			} else {
				System.out.println("not eligible");
			}
		} catch (CustomException2 e1) {
			e1.printStackTrace(); // Used to show which type of exception we are getting in the console
			System.out.println("your are not eligible exception handled");

		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in); // Used to enter input
		System.out.println("Enter your age");
		int age = sc.nextInt();
		e(age);
		System.out.println("Hello Custom Exception ");

	}

}
