package Selenium_FrameWork;

public class Array_03_Interview_Question {

	public static void main(String[] args) {

		// Find the largest and smallest number in an array
		int[] arr = { 12, 13, 14, 15, 16 };

		int max = arr[0], min = arr[0];

		for (int element : arr) {
			if (element > max) {
				max = element;

			}
			if (element < min) {
				min = element;
			}

		}
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);

	}

}
