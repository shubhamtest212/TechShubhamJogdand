package Selenium_FrameWork;

public class Exception_Handling_1 {

	public static void main(String[] args) {

		// Exception Handling :
		// try : we use to enclose the block of code which might throw exception
		// catch : we use to handle the exception
		// finally : will always execute whether exception is handled or not
		// throw : we use to create custom exception
		// throws : we use to declare multiple exception

		// Throwable : Parent class
		// Exception : child class
		// Error : Child class

		// Throwable class has 2 child called Exception Class and Error Class.

		try {
			int a = 5 / 0; // java.lang.ArithmeticException:
		} catch (ArithmeticException a) {
			a.printStackTrace(); // print complete exception information
			System.out.println(a); // print only exception information
		} catch (NullPointerException n) {
			n.printStackTrace();
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException f) {
			f.printStackTrace();
			System.out.println(f);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Exception Handled");

	}

}
