package Practices_Codes;

public class Java_1 {

	public static void main(String[] args) {

		// Declare an Array
		int a[] = new int[5];

		// Print the length of an Array & length is the property of an Array
		System.out.println(a.length);

		// Print the default value of an integer array
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
		}

		// Assign value to an array
		a[0] = 100;
		a[1] = 101;
		a[2] = 102;
		a[3] = 103;

		// Print the all array elements
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
