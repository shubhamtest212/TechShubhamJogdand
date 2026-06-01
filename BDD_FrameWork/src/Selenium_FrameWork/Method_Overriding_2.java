package Selenium_FrameWork;

public class Method_Overriding_2 extends Method_Overriding_1 {

	@Override
	public void eat() {
		System.out.println("you are eating");

	}

	public static void main(String[] args) {

		Method_Overriding_2 mo2 = new Method_Overriding_2();
		mo2.eat();

		Method_Overriding_1 mo1 = new Method_Overriding_1();
		mo1.eat();


	}
}
