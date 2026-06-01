package Selenium_FrameWork;

public class Constructor_002 {

	int id;
	String name;
	String address;

	// Default Constructor
	Constructor_002() {
		System.out.println("Hello Default Constructor");

	}

	// Parameterized Constructor
	Constructor_002(int a, String b, String c) {
		id = a;
		name = b;
		address = c;

	}

	// Non-static method
	public void aMethod() {
		System.out.println(id + " " + name + " " + address);

	}

	public static void main(String[] args) {
		// Default Constructor
		Constructor_002 c2 = new Constructor_002();
		// Parameterized Constructor
		Constructor_002 c3 = new Constructor_002(12, "shubham", "pune");
		c3.aMethod();
		// set-up Parameterized Constructor multiple times
		Constructor_002 c4 = new Constructor_002(6, "shubhams", "Washim");
		c4.aMethod();
	}
}
