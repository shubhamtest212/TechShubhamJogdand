package Selenium_FrameWork;

public class CountCharacter_2 {

	public static void main(String[] args) {

		String str = "SHUBHAM";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'S') {
				count++;
			}
		}

		System.out.println("Number of Types 'H' occured :" + count);

	}

}
