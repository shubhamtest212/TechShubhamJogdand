package Selenium_FrameWork;

public class Non_static_methods2 {

	int age;
	String name;
	static String organizations = "Firstcry_com";
	static String designation = "QA_Engineer1";

	public void getResult(int i, String n) {
		age = i;
		name = n;
		System.out.println(age + " " + name + " " + organizations + " " + designation);

	}

	public static void main(String[] args) {
		Non_static_methods2 ns1 = new Non_static_methods2();
		ns1.getResult(26, "SHUBHAM");

	}

}
