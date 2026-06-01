package Selenium_FrameWork;

public class ENCAPSU4 {

	double FC;

	public void setDetails(Double f) {
		FC = f;

	}

	public double getDetails() {
		return FC;
	}

	public static void main(String[] args) {
		ENCAPSU4 epss = new ENCAPSU4();
		epss.setDetails(8.5);
		System.out.println(epss.getDetails());

	}
}
