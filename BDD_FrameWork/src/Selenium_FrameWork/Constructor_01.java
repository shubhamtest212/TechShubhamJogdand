package Selenium_FrameWork;

public class Constructor_01 {

	int roll;

	// Constructor - method name will be same as class name
	// There are 2 types of Constructor i.e. Default Constructor and Parameterized
	// Constructor
	// Default Constructor- No Parameter
	// Parameterized Constructor - Having Paramater
	// Difference between method overloading and Constructor are only in constructor
	// class name should be same method name

	Constructor_01() {
		System.out.println("Default Constructor");
	}

	Constructor_01(int a) {
		roll = a;
		System.out.println(a);

	}

	public static void main(String[] args) {
		Constructor_01 c1 = new Constructor_01();
		System.out.println(11);

	}
}
