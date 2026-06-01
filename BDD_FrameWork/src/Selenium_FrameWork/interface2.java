package Selenium_FrameWork;

public class interface2 implements interface1 {

	@Override
	public void a() {
		System.out.println("a method");

	}

	@Override
	public void b() {
		System.out.println("b method");

	}

	public static void main(String[] args) {
		interface2 i2 = new interface2();
		i2.a();
		i2.b();
	}

}
