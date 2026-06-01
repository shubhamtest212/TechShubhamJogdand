package Selenium_FrameWork;

public class Inheritance_002 extends Inheritance_001 {

	public static void write() {
		System.out.println("I am wiriting");
	}

	public static void main(String[] args) {

		Inheritance_002 i002 = new Inheritance_002();
		Inheritance_001.eat();
		Inheritance_002.write();

	}

}
