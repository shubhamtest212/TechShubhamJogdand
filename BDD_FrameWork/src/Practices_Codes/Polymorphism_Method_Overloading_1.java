package Practices_Codes;

public class Polymorphism_Method_Overloading_1 {

	public void aMethod(int a) {
		System.out.println("int parameter");

	}

	public void aMethod() {
		System.out.println("No parameter");

	}

	public void aMethod(int a, String b) {
		System.out.println("2 parameters");

	}

	public static void main(String[] args) {

		Polymorphism_Method_Overloading_1 mo1 = new Polymorphism_Method_Overloading_1();
		mo1.aMethod();
		mo1.aMethod(2000);
		mo1.aMethod(12, "Shubham");
	}

}
