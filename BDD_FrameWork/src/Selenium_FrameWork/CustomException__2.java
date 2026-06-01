package Selenium_FrameWork;

import java.util.Scanner;

public class CustomException__2 {

	public static void aMethod(int age) throws Exception {

		try {
			if (age < 18) {
				throw new CustomException__1("Age is not matched here");

			} else {
				System.out.println("age is matched");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hello try catch handled");
		}

	}

	public static void main(String[] args) throws Exception {
		CustomException__2 c2 = new CustomException__2();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		aMethod(age);
		System.out.println("Hello Custom Exception");

	}

}
