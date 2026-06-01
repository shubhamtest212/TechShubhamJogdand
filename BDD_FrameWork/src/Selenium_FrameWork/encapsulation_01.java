package Selenium_FrameWork;

public class encapsulation_01 {

	String king;

	public void setDetails(String l) {
		king = l;
	}

	public String getDetails() {
		return king;

	}

	public static void main(String[] args) {
		encapsulation_01 epc = new encapsulation_01();
		epc.setDetails("SHUBHAM");
		System.out.println(epc.getDetails());
		epc.setDetails("SANTOSH");
		System.out.println(epc.getDetails());
		epc.setDetails("JOGDAND");
		System.out.println(epc.getDetails());

	}

}
