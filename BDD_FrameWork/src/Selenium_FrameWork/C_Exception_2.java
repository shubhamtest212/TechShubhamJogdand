package Selenium_FrameWork;

import java.util.Scanner;

public class C_Exception_2 {

	public static void c(int age) throws Exception {
		try {
			if (age == 18) {
				throw new C_Exception_1("Handled exception here your age is 18");

			} else {
				System.out.println("your age is not sufficient");
			}
		} catch (C_Exception_1 c) {
			c.printStackTrace();
			System.out.println("your age is sufficient for voting");

		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		c(age);
		System.out.println("Exception handled here");

	}
}
