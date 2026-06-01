package Practices_Codes;

public class Abstraction2 extends Abstraction1 {

	@Override
	public void eat() {
		System.out.println("Please eat");

	}

	public static void main(String[] args) {

		Abstraction2 ab2 = new Abstraction2();
		ab2.eat();
		ab2.b();

	}

}
