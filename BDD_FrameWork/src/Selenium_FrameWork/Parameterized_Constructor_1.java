package Selenium_FrameWork;

public class Parameterized_Constructor_1 {

	// Parameterized Constructor
	Parameterized_Constructor_1(int a, int b, int c) {
		System.out.println("Hello Parameterized_Constructor_1");

	}

	// Parameterized Constructor
	Parameterized_Constructor_1(String a, String b, String c) {
		System.out.println("Hello Parameterized_Constructor_2");

	}

	public static void main(String[] args) {
		Parameterized_Constructor_1 pc1 = new Parameterized_Constructor_1(12, 6, 199);
		Parameterized_Constructor_1 pc2 = new Parameterized_Constructor_1("shubham", "santosh", "jogdand");

	}

}

// Constructor : It's special type of method
// Means constructor name will be same as class name
// There are two types of Constructor i.e. Default Constructor and Parameterized Constructor
// Default Constructor : No Parameter
// Parameterized Constructor : Having Parameter
// Constructor Overloading : Method name will be same as class name but different parameters are called as Constructor Overloading
