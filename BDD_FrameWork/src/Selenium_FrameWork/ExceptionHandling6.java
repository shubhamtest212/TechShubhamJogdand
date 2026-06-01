package Selenium_FrameWork;

import java.util.Scanner;

public class ExceptionHandling6 {

	public static void a(int age) throws Exception {
		try {
			if (age < 18) {
				throw new ExceptionHandling5("Age is less than 18");
			} else {
				System.out.println("Eligible");
			}
		} catch (ExceptionHandling5 e) {
			e.printStackTrace();
			System.out.println("Age is less than 18 but exception handled");

		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		a(age);
		System.out.println("Hello Custom Exception");

	}
}
