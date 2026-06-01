package Selenium_FrameWork;

public class Interface_5 extends Inheritance_01 implements Interface_1, Interface_3, Interface_4 {

	@Override
	public void a() {
		System.out.println("a method");

	}

	@Override
	public void b() {
		System.out.println("b method");

	}

	public static void main(String[] args) {
		Interface_5 i5 = new Interface_5();
		i5.a(); // a method
		i5.b(); // b method

	}
}
