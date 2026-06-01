package Selenium_FrameWork;

public class Abstract2 extends Abstract1 {

	@Override
	public void eat() {
		System.out.println("Please eat fastfood");

	}

	public static void main(String[] args) {

		Abstract2 ab2 = new Abstract2();
		ab2.eat();
		ab2.a();
		System.out.println("Hello Shubham Jogdand");

	}

}
