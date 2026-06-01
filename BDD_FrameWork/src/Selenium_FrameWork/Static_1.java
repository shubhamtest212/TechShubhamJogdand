package Selenium_FrameWork;

public class Static_1 {

	int roll; // Global variable
	String name; // Global variable
	static String college = "IIT Bombay"; // Static variable

	public void getResult(int r, String n) {
		roll = r;
		name = n;
		System.out.println(roll + " " + name + " " + college);
	}

	public static void main(String[] args) {
		Static_1 str1 = new Static_1();
		str1.getResult(1, "Shubham"); // 1 Shubham IIT Bombay

	}
}
