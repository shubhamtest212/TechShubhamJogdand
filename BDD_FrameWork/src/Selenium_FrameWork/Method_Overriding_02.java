package Selenium_FrameWork;

public class Method_Overriding_02 extends Method_Overriding_01 {

	@Override
	public void eat() {
		System.out.println("you are eating your dishes");
	}

	public static void main(String[] args) {
		Method_Overriding_02 mo2 = new Method_Overriding_02();
		mo2.eat();

		Method_Overriding_01 mo1 = new Method_Overriding_01();
		mo1.eat();
	}
}
