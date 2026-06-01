package Practices_Codes;

// Method Overloading & Method Overriding

// Method Overloading- 2 or more than 2 methods having same method name and different types of parameters
// Method Overriding- 2 or more than 2 methods having same method name and same parameters
// Method overloading posible in single class
// Method overriding not possible in single class
// Number of parameters- Types of parameters

public class Polymorphism_1 {

	public void aMethod() {
		System.out.println("No parameter");

	}

	public void aMethod(int a, int b, int c) {
		System.out.println("int parameter");

	}

	public void aMethod(String a, String b, String c) {
		System.out.println("string parameter");

	}

	public static void main(String[] args) {

		Polymorphism_1 po1 = new Polymorphism_1();
		po1.aMethod();
		po1.aMethod(12, 6, 1999);
		po1.aMethod("Shubha", "Santosh", "Jogdand");

	}

}
