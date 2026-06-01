package Selenium_FrameWork;

public class I2 implements I1 {

	@Override
	public void a() {
		System.out.println("a method");

	}

	@Override
	public void b() {
		System.out.println("b method");

	}

	@Override
	public void c() {
		System.out.println("c method");

	}

	@Override
	public void d() {
		System.out.println("d method");

	}

	public static void main(String[] args) {
		I2 i2 = new I2();
		i2.a();
		i2.b();
		i2.c();
		i2.d();

	}

}
