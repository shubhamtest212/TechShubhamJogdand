package Selenium_FrameWork;

public class Array_04_Interview_Question {

	// Find the largest and smallest number in an array
	public static void main(String[] args) {

		int[] arr = { 100, 200, 300 };
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
