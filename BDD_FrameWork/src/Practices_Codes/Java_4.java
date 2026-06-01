package Practices_Codes;

public class Java_4 {

	public static void main(String[] args) {

		// Interview Question mostly asked for QA Automation Engineer Find the largest
		// and smallest number in an array

		int[] arr = { 101, 102, 100, 103, 104, 10001 };
		int max = arr[0];
		int min = arr[0];

		for (int element : arr) {
			if (element > max) {
				max = element;
			}
			if (element < min) {
				min = element;
			}
		}

		System.out.println("MAX:" + max);
		System.out.println("MIN:" + min);

	}

}
