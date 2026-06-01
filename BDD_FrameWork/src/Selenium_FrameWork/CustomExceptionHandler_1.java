package Selenium_FrameWork;

import java.util.Scanner;

public class CustomExceptionHandler_1 {

	public static void a(int age) {

		try {
			if (age < 18) {
				throw new CustomException_1("you are not eligible for voting if the age is less than 18");
			} else {
				System.out.println("you are eligible");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("you are not eligible for voting");

		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		a(age);
		System.out.println("custom exception handled here");

	}

}
