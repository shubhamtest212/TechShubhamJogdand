package Selenium_FrameWork;

public class Constructor_3 {

	// Constructor Overloading method name will same but different parameters
	Constructor_3() {
		System.out.println("No Parameter");
	}

	Constructor_3(int n) {
		System.out.println("int parameter");

	}

	Constructor_3(String s) {
		System.out.println("string parameter");
	}

	public static void main(String[] args) {
		Constructor_3 c1 = new Constructor_3(); // No Parameter
		Constructor_3 c4 = new Constructor_3(111); // int Parameter
		Constructor_3 c5 = new Constructor_3("shubham"); // String Parameter
	}
}
