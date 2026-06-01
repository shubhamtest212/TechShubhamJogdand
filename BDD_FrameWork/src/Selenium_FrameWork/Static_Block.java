package Selenium_FrameWork;

public class Static_Block {

	static int num;
	static String mystr;

	static {
		num = 97;
		mystr = "Static Keyword in Java";
	}

	public static void main(String[] args) {
		System.out.println("Value of num :" + num);
		System.out.println("Value of mystr : " + mystr);
	}

}
