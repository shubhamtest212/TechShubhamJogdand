package Selenium_FrameWork;

import java.util.Scanner;

public class ExceptionHandling8 {

	public static void a(int age) throws Exception {
		try {
			if (age < 20) {
				throw new ExceptionHandling7(" yes eligible");
			} else {
				System.out.println("Eligible");
			}
		} catch (ExceptionHandling7 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		a(age);
		System.out.println("hello custom exception handled here");
	}

}
