package Selenium_FrameWork;

public class Constructors7 {

	String FName;
	String MName;
	String LName;

	// This is parameterized constructor having parameters
	Constructors7(String x, String y, String z) {
		FName = x;
		MName = y;
		LName = z;

	}

	public void PersonalInfo() {
		System.out.println(FName + "" + MName + "" + LName);
	}

	public static void main(String[] args) {
		Constructors7 c7 = new Constructors7(" S ", " S ", " J ");
		Constructors7 c8 = new Constructors7(" QA ", " TEST ", " SDET ");
		Constructors7 c9 = new Constructors7(" SHUBHAM ", " SANTOSH ", " JOGDAND ");
		c9.PersonalInfo();
		c7.PersonalInfo();
		c8.PersonalInfo();

	}

}
