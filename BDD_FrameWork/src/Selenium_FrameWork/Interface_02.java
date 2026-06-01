package Selenium_FrameWork;

public class Interface_02 implements Interface_01 {

	@Override
	public void a() {
		System.out.println("Default a Constructor");

	}

	@Override
	public void b() {
		System.out.println("Default b Constructor");

	}

	public static void main(String[] args) {

		Interface_02 if2 = new Interface_02();
		if2.a();
		if2.b();
	}
}
