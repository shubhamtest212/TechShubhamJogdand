package Selenium_FrameWork;

public class Interface__2 implements Interface__1 {

	@Override
	public void aMethod() {
		System.out.println("a method");

	}

	@Override
	public void bMethod() {
		System.out.println("b method");

	}
	
	public static void main(String[] args) {
		Interface__2 if2 = new Interface__2();
		if2.aMethod();
		if2.bMethod();
	}

}
