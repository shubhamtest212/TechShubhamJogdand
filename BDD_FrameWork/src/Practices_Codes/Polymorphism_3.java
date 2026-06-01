package Practices_Codes;

public class Polymorphism_3 extends Polymorphism_2 {

	public void sub(int a) {
		System.out.println("int a ");

	}

	public static void main(String[] args) {

		Polymorphism_3 po3 = new Polymorphism_3();
		po3.sub(12);

	}

}

// Method overriding is not possible in single class as compare to Method overloading
// Need to extends one class with another
// with same method name and same parameter
// This is concept of polymorphism- method overloading and method overriding
