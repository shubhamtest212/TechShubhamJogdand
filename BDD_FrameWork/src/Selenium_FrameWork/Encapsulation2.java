package Selenium_FrameWork;

public class Encapsulation2 extends Encapsulation1 {

	public static void main(String[] args) {

		Encapsulation2 e2 = new Encapsulation2();
		e2.setDetails(12);
		System.out.println(e2.getDetails());
		e2.setDetails(1999);
		System.out.println(e2.getDetails());

	}

}
