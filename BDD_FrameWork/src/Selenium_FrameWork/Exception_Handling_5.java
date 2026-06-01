package Selenium_FrameWork;

import java.util.Scanner;

public class Exception_Handling_5 {

	public static void a(int age) throws Exception {

		try {
			if (age < 18) {
				throw new Exception_Handling_5_Custom_Exception("Age is less than 18");
			} else {
				System.out.println("Eligible");
			}
		} catch (Exception_Handling_5_Custom_Exception e) {

			System.out.println("Exception handled- Age is less than 18");

		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current age");
		int age = sc.nextInt();
		a(age);
		System.out.println("Hello Custom Exception");

	}
}
