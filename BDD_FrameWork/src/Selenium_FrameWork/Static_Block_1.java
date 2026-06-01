package Selenium_FrameWork;

public class Static_Block_1 {

	static int num;
	static String mystr;

	static {
		num = 1999;
		mystr = "SHUBHAM";
	}

	public static void main(String[] args) {
		System.out.println("Value of num:" + num);
		System.out.println("Value of mystr:" + mystr);

	}

}
