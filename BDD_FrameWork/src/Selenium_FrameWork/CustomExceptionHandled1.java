package Selenium_FrameWork;

import java.util.Scanner;

public class CustomExceptionHandled1 {

	public static void d(int age) throws Exception {

		try {
			if (age < 50) {
				throw new CustomException1("Age is less than 50 - You are not eligible");
			} else {
				System.out.println("Eligible");
			}
		} catch (CustomException1 e) {
			e.printStackTrace();
			System.out.println("Age is less than 50 but exception handled here");

		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		d(age);
		System.out.println("Hello custom exception");

	}

}
