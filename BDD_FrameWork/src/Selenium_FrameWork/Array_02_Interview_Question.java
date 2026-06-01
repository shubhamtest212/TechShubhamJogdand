package Selenium_FrameWork;

public class Array_02_Interview_Question {

	// Interview Question mostly asked for QA Automation Engineer Find the largest
	// and smallest number in an array
	public static void main(String[] args) {

		int[] arr = { 10, 5, 20, 8 };
		int max = arr[0], min = arr[0];

		for (int element : arr) {
			if (element > max) {
				max = element;
			}
			if (element < min) {
				min = element;
			}
		}
		System.out.println("MAX: " + max);
		System.out.println("MIN : " + min);
	}

}
