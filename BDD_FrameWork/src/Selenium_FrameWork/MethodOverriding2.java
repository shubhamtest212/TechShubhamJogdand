package Selenium_FrameWork;

// Method overriding - Having same method name and same parameters

public class MethodOverriding2 extends MethodOverriding1 {

	@Override
	public void eat() {
		System.out.println("you are eating");
	}

	public static void main(String[] args) {
		MethodOverriding2 mo2 = new MethodOverriding2();
		mo2.eat();

	}
}
