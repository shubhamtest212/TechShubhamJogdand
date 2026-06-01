package Selenium_FrameWork;

public class Constructors5 {

	String shubham;
	String santosh;
	String jogdand;

	// Default Constructors
	Constructors5() {
		System.out.println("Default constructor means no paramater available in the constructor");

	}

	// Parameterized Constructors
	Constructors5(String a, String b, String c) {
		shubham = a;
		santosh = b;
		jogdand = c;

	}

	// Non-static method
	public void displayData() {
		System.out.println(shubham + " " + santosh + " " + jogdand);
	}

	public static void main(String[] args) {
		Constructors5 c5 = new Constructors5();
		Constructors5 c6 = new Constructors5("SHUBHAMS", "SANTOSHS", "JOGDANDJ");
		c6.displayData();

	}

}
