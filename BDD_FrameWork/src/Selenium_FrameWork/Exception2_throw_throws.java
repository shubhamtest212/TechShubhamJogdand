package Selenium_FrameWork;

import java.util.Scanner;

public class Exception2_throw_throws {

	public static void b(int age) throws Exception {

		try {
			if (age == 18) {
				throw new Exception1_throw_throws("you are eligible");
			} else {
				System.out.println("you are not eligible");
			}
		} catch (Exception1_throw_throws e) {
			e.printStackTrace();
			System.out.println("you are eligible");

		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		b(age);
	}

}

// throw and throws used here to handled custom exception
