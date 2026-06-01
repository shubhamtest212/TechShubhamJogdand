package Practices_Codes;

public class Inheritance_4 extends Inheritance_3 {

	public void multiply(int x, int y) {
		z = x * y;
		System.out.println(z);
	}

	public void divid(int x, int y) {
		z = x / y;
		System.out.println(z);
	}

	public static void main(String[] args) {

		Inheritance_4 i4 = new Inheritance_4();

		int x = 20;
		int y = 10;

		i4.add(2, 3); // This is the properties of Inheritance_3
		i4.substract(3, 2); // This is the properties of Inheritance_3
		i4.multiply(1, 1); // This is the properties of Inheritance_4
		i4.divid(2, 2); // This is the properties of Inheritance_4
		i4.add(x, y);

	}
}
