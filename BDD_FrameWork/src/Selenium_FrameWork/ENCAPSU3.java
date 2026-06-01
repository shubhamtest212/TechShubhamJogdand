package Selenium_FrameWork;

public class ENCAPSU3 {

	String FName;

	public void setDetails(String a) {

		FName = a;

	}

	public String getDetails() {
		return FName;

	}

	public static void main(String[] args) {
		ENCAPSU3 eps = new ENCAPSU3();
		eps.setDetails("QAEngineer");
		System.out.println(eps.getDetails());

	}

}
