package Selenium_FrameWork;

public class Method_Overriding_03 extends Method_Overriding_01 {

	@Override
	public void eat() {
		System.out.println("why you are eating");
	}

	public static void main(String[] args) {
		Method_Overriding_03 mo3 = new Method_Overriding_03();
		mo3.eat();

		Method_Overriding_01 mo1 = new Method_Overriding_01();
		mo1.eat();

	}
}
