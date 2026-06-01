package Selenium_FrameWork;

public class Constructors9 {

	int age;
	String FName;
	String LName;

	// Default constructor
	Constructors9() {
		System.out.println("Default constructor means no paramater");

	}

	// Parameterized constructor

	Constructors9(int a, String b, String c) {
		age = a;
		FName = b;
		LName = c;

	}

	// non-static method
	public void getData() {
		System.out.println(age + " " + FName + " " + LName + "");
	}

	public static void main(String[] args) {
		Constructors9 c9 = new Constructors9();
		Constructors9 c10 = new Constructors9(27, "SHUBHAM", "JOGDAND");
		c10.getData();

	}

}
