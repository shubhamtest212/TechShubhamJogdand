package Selenium_FrameWork;

public class Encapsulation3 {

	String inputData;

	public void setDetails(String a) {
		inputData = a;

	}

	public Object getDetails() {
		return inputData;
	}

	public static void main(String[] args) {

		Encapsulation3 e3 = new Encapsulation3();
		e3.setDetails("Selenium");
		System.out.println(e3.getDetails());
		e3.setDetails("Automation");
		System.out.println(e3.getDetails());

	}

}
