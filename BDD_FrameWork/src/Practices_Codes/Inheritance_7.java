package Practices_Codes;

//This is multilevel Inheritance example

public class Inheritance_7 extends Inheritance_6 {

	public void eat() {
		System.out.println("I am eating");
	}

	public static void main(String[] args) {

		Inheritance_7 i7 = new Inheritance_7();
		i7.write();
		i7.read();
		i7.eat();
	}
}
