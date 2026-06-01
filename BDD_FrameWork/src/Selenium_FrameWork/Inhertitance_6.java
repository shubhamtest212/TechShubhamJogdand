package Selenium_FrameWork;

public class Inhertitance_6 extends Inhertitance_5 {

	public void multiply(int x, int y) {
		z = x * y;
		System.out.println(z);
	}

	public void div(int x, int y) {
		z = x / y;
		System.out.println(z);

	}

	public static void main(String[] args) {

		Inhertitance_6 i6 = new Inhertitance_6();

		int x = 20;
		int y = 10;

		i6.add(x, y); // 30
		i6.substract(20, 15); // 5
		i6.multiply(x, y); // 200
		i6.div(x, y); // 2

	}

}
