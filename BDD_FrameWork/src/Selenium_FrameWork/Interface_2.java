package Selenium_FrameWork;

public class Interface_2 implements Interface_1 {

	@Override
	public void a() {
		System.out.println("a method");

	}

	@Override
	public void b() {
		System.out.println("b method");

	}

	public static void main(String[] args) {
		Interface_2 if2 = new Interface_2();
		if2.a();
		if2.b();

	}

}
