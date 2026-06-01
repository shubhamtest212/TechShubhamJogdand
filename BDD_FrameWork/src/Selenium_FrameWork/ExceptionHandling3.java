package Selenium_FrameWork;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void c(int age) throws Exception {

		try {
			if (age < 20) {
				throw new ExceptionalHandling1CustomException2("Age is less than 20- Not eligible");
			} else {
				System.out.println("Eligible");
			}
		} catch (ExceptionalHandling1CustomException2 e) {
			e.printStackTrace();
			System.out.println("Age is less than 20 but exception handled here");

		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		c(age);
		System.out.println("Hello custom exception");

	}

}
