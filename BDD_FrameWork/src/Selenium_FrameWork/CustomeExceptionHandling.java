package Selenium_FrameWork;

import java.util.Scanner;

public class CustomeExceptionHandling {

	public static void b(int age) throws Exception {

		try {
			if (age >= 18) {
				throw new CustomExceptionHandler1("you are eligible for voting if the age is greather than 19");
			} else {
				System.out.println("you are not eligible for voting");
			}
		} catch (CustomExceptionHandler1 e) {
			e.printStackTrace();
			System.out.println("you are eligible for voting if the age is greather than 18");

		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		b(age);
		System.out.println("you have handled custom exception here");

	}

}

// Access modifiers
// public - Accessible
