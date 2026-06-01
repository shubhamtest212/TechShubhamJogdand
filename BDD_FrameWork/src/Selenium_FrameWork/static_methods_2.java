package Selenium_FrameWork;

public class static_methods_2 {

	int age;
	String name;

	public void getResult(int i, String s) {
		age = i;
		name = s;
		System.out.println(age + " " + name);

	}

	public static void main(String[] args) {
		static_methods_2 sm2 = new static_methods_2();
		sm2.getResult(26, "SHUBHAM");

	}

}
