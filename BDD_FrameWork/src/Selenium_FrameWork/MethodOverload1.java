package Selenium_FrameWork;

public class MethodOverload1 {

	public void aMethod(int a) {
		System.out.println("int parameter");
	}

	public void aMethod() {
		System.out.println("No Parameter");
	}

	public void aMethod(int a, String c) {
		System.out.println("Different type of parameters");
	}

	public void aMethod(int a, int b, int c, int d) {
		System.out.println("Having four types of parameters");
	}

	public static void main(String[] args) {
		MethodOverload1 mo1 = new MethodOverload1();
		mo1.aMethod();
		mo1.aMethod(1000);
		mo1.aMethod(10, "SHUBHAM");
		mo1.aMethod(1, 2, 32, 4);

	}

}

// Number of parameter i.e. int a, int b, int c
// Type of parameter i.e. int a, int b, String c
