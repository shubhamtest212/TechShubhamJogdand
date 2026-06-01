package Selenium_FrameWork;

public class Method_Overloading2 extends Method_Overloading1 {

	@Override
	public void cMethod(int a, int b, int c, int d) {
		System.out.println("method overridings");

	}

	public static void main(String[] args) {
		Method_Overloading2 mo2 = new Method_Overloading2();
		mo2.cMethod(12, 11, 10, 9);
		Method_Overloading1 mo1 = new Method_Overloading1();

	}
}
