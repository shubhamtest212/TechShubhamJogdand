package Selenium_FrameWork;

public class ENCAPSU1 {

	int king; // Global int variable
	String queen; // Global string variable
	Object kingqueen; // Global object variable

	// set the method and datatype used int
	public void setDetails(int a, String b, Object c) {
		king = a;
		queen = b;
		kingqueen = c;
	}

	// get the method and returning king
	public int getDetails1() {
		return king;

	}

	public String getDetails2() {
		return queen;

	}

	public Object getDetails3() {
		return kingqueen;
	}

	public static void main(String[] args) {
		ENCAPSU1 eps2 = new ENCAPSU1();
		eps2.setDetails(12, "shubham", 1999);
		System.out.println(eps2.getDetails1());

	}

}
