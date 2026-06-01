package Selenium_FrameWork;

public class MOverride2 extends MOverride1 {

	@Override
	public void cMethod() {
		System.out.println("Method Overriding1");
	}

	public static void main(String[] args) {
		MOverride2 mo2 = new MOverride2();
		mo2.cMethod();
		MOverride1 mo1 = new MOverride1();
		mo1.cMethod();

	}

}
