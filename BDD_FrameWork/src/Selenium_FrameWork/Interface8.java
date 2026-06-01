package Selenium_FrameWork;

public class Interface8 implements Interface6, Interface7 {

	@Override
	public void a() {
		System.out.println("a method");

	}

	@Override
	public void v() {
		System.out.println("b method");

	}

	public static void main(String[] args) {
		Interface8 i8 = new Interface8();
		i8.a();
		i8.v();

	}

}
