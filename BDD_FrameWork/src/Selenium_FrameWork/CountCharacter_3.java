package Selenium_FrameWork;

public class CountCharacter_3 {

	public static void main(String[] args) {

		String str = "Aaauuttomation";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a') {
				count++;

			}

		}
		System.out.println("Number of A in Auuttomation :" + count);

	}

}
