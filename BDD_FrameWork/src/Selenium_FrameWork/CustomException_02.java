package Selenium_FrameWork;

import java.util.Scanner;

public class CustomException_02 {

	public static void c(int age) throws Exception {
		try {
			if (age < 18) {
				throw new CustomException_01("Age is not matched");

			} else {
				System.out.println("Eligible");
			}

		} catch (CustomException_01 C) {
			System.out.println("not eligible");
		}
	}

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current age");
		int age = sc.nextInt();
		c(age);
		System.out.println("Custom Exception Handled");

	}

}
