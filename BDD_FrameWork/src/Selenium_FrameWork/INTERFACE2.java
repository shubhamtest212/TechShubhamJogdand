package Selenium_FrameWork;

public class INTERFACE2 implements INTERFACE1 {

	@Override
	public void a() {
		System.out.println("a method");

	}

	@Override
	public void b() {
		System.out.println("b method");
	}

	public static void main(String[] args) {
		INTERFACE2 i2 = new INTERFACE2();
		i2.a();
		i2.b();

	}
}
