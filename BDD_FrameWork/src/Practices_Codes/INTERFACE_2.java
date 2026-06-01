package Practices_Codes;

public class INTERFACE_2 implements INTERFACE_1 {

	public void aMETHOD() {
		System.out.println("aMETHOD");

	}

	public void bMETHOD() {
		System.out.println("bMETHOD");

	}

	public static void main(String[] args) {

		INTERFACE_2 I2 = new INTERFACE_2();
		I2.aMETHOD();
		I2.bMETHOD();
	}

}
