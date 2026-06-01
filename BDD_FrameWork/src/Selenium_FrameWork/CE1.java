package Selenium_FrameWork;

import java.util.Scanner;

public class CE1 {

	public static void c(int age) throws Exception {

		try {
			if (age == 18) {
				throw new CE("YOUR AGE IS EQUAL TO 18");
			} else {
				System.out.println("YOUR AGE IS LESS THAN 18");
			}
		} catch (CE c) {
			c.printStackTrace();
			System.out.println("YOUR AGE IS EQUAL TO 18");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc1.nextInt();
		c(age);
		System.out.println("exception handled here");

	}

}
