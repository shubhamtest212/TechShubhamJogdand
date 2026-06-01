package Selenium_FrameWork;

public class Encapsulations2 extends Encapsulations1 {

	int q;

	public void setDetails(int q) {
		q = q;
	}

	public static void main(String[] args) {

		Encapsulations2 enc2 = new Encapsulations2();
		enc2.setDetails(1999);
		System.out.println(enc2.getDetails());
		enc2.setDetails("BDD", "FrameWork", 12);
		System.out.println(enc2.getDetails1());

	}

}
