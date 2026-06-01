package Selenium_FrameWork;

public class ENCAPSU5 {

	char BB;

	public void setDetials(char b) {
		BB = b;
	}

	public char getDetails() {
		return BB;

	}

	public static void main(String[] args) {
		ENCAPSU5 epcc = new ENCAPSU5();

		epcc.setDetials('S');
		System.out.println(epcc.getDetails());

	}

}
