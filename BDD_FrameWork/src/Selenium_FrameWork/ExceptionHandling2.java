package Selenium_FrameWork;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void b(int age) throws Exception {

		try {
			if (age < 10) {
				throw new ExceptionalHandling1CustomException1("Age is less than 10-Not eligible");
			} else {
				System.out.println("Eligible");
			}
		} catch (ExceptionalHandling1CustomException1 e) {
			e.printStackTrace();
			System.out.println("Age is less than 18- But exception handled here");
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		b(age);
		System.out.println("Hello custom Exception");

	}

}
