package Selenium_FrameWork;

public class Inheritance_03 extends Inheritance_02 {

	public void playing() {
		System.out.println("Shubham is playing");
	}

	public static void main(String[] args) {
		Inheritance_03 i3 = new Inheritance_03();
		i3.eat();
		i3.write();
		i3.playing();

	}
}
