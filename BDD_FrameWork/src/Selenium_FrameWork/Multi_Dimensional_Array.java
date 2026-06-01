package Selenium_FrameWork;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {

		// multi-dimensional array
		int a[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };

		// total number of rows
		int row = a.length;
		System.out.println(row);

		// total number of columns for each row
		for (int i = 0; i < row; i++) {
			System.out.println(a[i].length);

		}

		// print all values
		// outer loop
		for (int i = 0; i < row; i++) {

			// inner loop
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
	}

}
