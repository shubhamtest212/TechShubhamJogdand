package Selenium_FrameWork;

public class CountCharacter_1 {

	public static void main(String[] args) {

		String str = "ssshubham";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 's') {
				count++;
			}
		}
		System.out.println("Number of 's' in shubham : " + count);
	}

}
