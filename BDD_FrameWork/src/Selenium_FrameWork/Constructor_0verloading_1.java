package Selenium_FrameWork;

public class Constructor_0verloading_1 {

	// Default Constructor Overloading
	Constructor_0verloading_1() {
		System.out.println("Hello Default Constructor_0verloading_1");
	}

	// Parameterized Constructor Overloading
	Constructor_0verloading_1(int a) {
		System.out.println("Hello int a Constructor_0verloading_1");
	}

	// Parameterized Constructor Overloading
	Constructor_0verloading_1(String b) {
		System.out.println("Hello String b Constructor_0verloading_1");

	}

	public static void main(String[] args) {

		// Default Constructor
		Constructor_0verloading_1 co1 = new Constructor_0verloading_1();

		// Parameterized Constructor Overloading
		Constructor_0verloading_1 co2 = new Constructor_0verloading_1(12);

		// Parameterized Constructor Overloading
		Constructor_0verloading_1 co3 = new Constructor_0verloading_1("SHUBHAM");
	}

}
