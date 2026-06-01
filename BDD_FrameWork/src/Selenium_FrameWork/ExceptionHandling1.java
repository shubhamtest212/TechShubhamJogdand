package Selenium_FrameWork;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void a(int age) throws Exception {

		try {
			if (age < 18) {
				throw new ExceptionalHandling1CustomException("Age is less than 18- Not eligible");

			} else {
				System.out.println("Eligible");

			}
		} catch (ExceptionalHandling1CustomException e) {
			e.printStackTrace();
			System.out.println("Age is less than 18- But exception handled");
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		a(age);

	}
}
