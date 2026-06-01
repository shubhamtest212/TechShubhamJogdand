package Selenium_FrameWork;

public class Inheritance_04 extends Inheritance_03 {

	public void search() {
		System.out.println("Shubham is searching for eat, write and playing methodds");
	}

	public static void main(String[] args) {

		Inheritance_04 i4 = new Inheritance_04();
		i4.eat();
		i4.write();
		i4.playing();
		i4.search();

	}
}
