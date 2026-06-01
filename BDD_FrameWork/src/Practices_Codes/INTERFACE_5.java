package Practices_Codes;

public class INTERFACE_5 extends Inheritance_1 implements Interface_1 {

	public void aMethod() {
		System.out.println("aMETHOD");

	}

	public void bMethod() {
		System.out.println("bMETHOD");

	}

	public static void main(String[] args) {

		INTERFACE_5 i5 = new INTERFACE_5();
		i5.aMethod();
		i5.bMethod();
		System.out.println(i5.roll);
	}

}

// In the interface all the methods will be consider as Abstract method only
// Abstract method we can achieve by using implements
