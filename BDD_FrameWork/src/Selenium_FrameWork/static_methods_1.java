package Selenium_FrameWork;

public class static_methods_1 {

	int roll; // Global variable
	String name; // Global variable
	static String college = "IIT Bombay"; // Static variable

	public void getResult(int r, String n) {
		roll = r;
		name = n;
		System.out.println(roll + " " + name + " " + college);

	}

	public static void main(String[] args) {
		static_methods_1 sm1 = new static_methods_1();
		sm1.getResult(1, "SHUBHAM");
		sm1.getResult(2, "JOGDAND");
		sm1.getResult(1, "MCA");
		sm1.getResult(1, "TECHENGINEER");

	}
}
