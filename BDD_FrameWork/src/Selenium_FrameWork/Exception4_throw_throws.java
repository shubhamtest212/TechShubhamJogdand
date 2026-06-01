package Selenium_FrameWork;

import java.util.Scanner;

public class Exception4_throw_throws {

	public static void c(int age) throws Exception {

		try {
			if (age != 18) {
				throw new Exception3_throw_throws("you are eligible for voting");
			} else {
				System.out.println("you are not eligible for voting");
			}
		} catch (Exception3_throw_throws e) {
			e.printStackTrace();
			System.out.println("you are eligible for voting");

		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello age");
		int age = sc.nextInt();
		c(age);

	}
}
