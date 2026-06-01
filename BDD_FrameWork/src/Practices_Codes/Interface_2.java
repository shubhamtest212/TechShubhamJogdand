package Practices_Codes;

public class Interface_2 implements Interface_1 {

	@Override
	public void aMethod() {
		System.out.println("a method");

	}

	@Override
	public void bMethod() {
		System.out.println("b method");

	}

	public static void main(String[] args) {

		Interface_2 i2 = new Interface_2();
		i2.aMethod();
		i2.bMethod();
	}
}
