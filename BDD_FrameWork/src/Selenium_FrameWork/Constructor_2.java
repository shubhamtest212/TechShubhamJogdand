package Selenium_FrameWork;

public class Constructor_2 {

	int id; // Global Variable
	String name; // Global Variable
	String address; // Global Variable

	// Default Constructor
	Constructor_2() {
		System.out.println("Hello Default Constructor");
	}

	// Parameterized Constructor
	Constructor_2(int a, String b, String c) {
		id = a;
		name = b;
		address = c;

	}

	// Non static method
	public void displayInfo() {
		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {
		Constructor_2 c1 = new Constructor_2(); // Default Constructor

		Constructor_2 c2 = new Constructor_2(1, "SHUBHAM", "JOGDAND"); // Parameterized Constructor
		c2.displayInfo();
		Constructor_2 c3 = new Constructor_2(2, "FIRSTCRY", "PUNE"); // Parameterized Constructor
		c3.displayInfo();
		Constructor_2 c4 = new Constructor_2(3, "BB", "PUNE"); // Parameterized Constructor
		c4.displayInfo();

	}
}
