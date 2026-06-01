package Selenium_FrameWork;

import java.util.Scanner;

public class CustomExceptionHandling_02 {

	public static void b(int age) throws Exception {

		try {
			if (age < 18) {
				throw new CustomExceptionHandling_01("your age is less than 18");
			} else {
				System.out.println("if the age is greather than 18 then you are able to voting");
			}
		} catch (CustomExceptionHandling_01 e) {
			e.printStackTrace();
			System.out.println("your age is less than 18");
		}
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		b(age);
		System.out.println("custom exception handled here");

	}

}
