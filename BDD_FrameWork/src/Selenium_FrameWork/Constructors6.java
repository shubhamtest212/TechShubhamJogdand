package Selenium_FrameWork;

public class Constructors6 {

	int age; // Global variable
	String Fname; // Global variable
	String Lname; // Global variable
	String Education; // Global variable

	Constructors6() {
		System.out.println("Default constructor means no parameter only class name and method will be same");

	}

	Constructors6(int a, String b, String c, String d) {
		age = a;
		Fname = b;
		Lname = c;
		Education = d;
		System.out.println(a + b + c + d);

	}

	// Non-static method
	public void displayPersonalData() {
		System.out.println(age + " " + Fname + "" + Lname + "" + Education);

	}

	public static void main(String[] args) {
		Constructors6 c6 = new Constructors6();
		Constructors6 c7 = new Constructors6(26, "Shubham", "Jogdand", "MCA");

	}

}
