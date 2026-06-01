package Selenium_FrameWork;

public class MOverload1 {

	public void bMethod(String a, String b) {
		System.out.println("Having 2 different parameters");
	}

	public void bMethod(String a, String b, String c) {
		System.out.println("Having 3 different parameters");
	}

	public static void main(String[] args) {
		MOverload1 mo1 = new MOverload1();
		mo1.bMethod("SHUBHAM", "JOGDAND");
		mo1.bMethod("SHUBHAM", "SANTOSH", "JOGDAND");

	}
}
