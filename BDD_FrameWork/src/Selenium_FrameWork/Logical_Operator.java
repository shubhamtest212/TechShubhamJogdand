package Selenium_FrameWork;

public class Logical_Operator {

	public static void main(String[] args) {

		int a = 10; // Local Variable
		int b = 5; // Local Variable
		int c = 20; // Local Variable

		// Logical Operator - If the 1st condition is false, then 2nd condition will not
		// execute
		System.out.println(a == b && a++ < c);
		System.out.println(a);

	}

}
