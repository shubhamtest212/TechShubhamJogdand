package Selenium_FrameWork;

public class Non_static_methods1 {

	int roll;
	String name;
	static String college = "IIT";

	public void getResult(int r, String n) {
		roll = r;
		name = n;
		System.out.println(roll + " " + name + " " + college);

	}

	public static void main(String[] args) {
		Non_static_methods1 ns1 = new Non_static_methods1();
		ns1.getResult(1, "SHUBHAM");

		ns1.getResult(2, "JOGDAND");

	}

}
