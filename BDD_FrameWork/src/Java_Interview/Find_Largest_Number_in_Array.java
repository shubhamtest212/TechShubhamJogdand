package Java_Interview;

public class Find_Largest_Number_in_Array {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int max1 = arr[0];

		for (int num : arr) {
			if (num > max1) {
				max1 = num;

			}
		}

		System.out.println(max1);

	}

}
