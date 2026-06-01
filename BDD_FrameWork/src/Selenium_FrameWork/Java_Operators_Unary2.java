package Selenium_FrameWork;

public class Java_Operators_Unary2 {

	public static void main(String[] args) {

		int a = 100; // Local Variable

		System.out.println(a); // 100
		System.out.println(a++); // 100
		System.out.println(a); // 101
		System.out.println(++a); // 102
		System.out.println(a); // 102
		System.out.println(a--); // 102
		System.out.println(a); // 101
		System.out.println(--a); // 100

		System.out.println(a++ + ++a); // 100, 101, 102, 102 = 202
		System.out.println(a + a++); // 102, 102, 103 = 204
	}

}
