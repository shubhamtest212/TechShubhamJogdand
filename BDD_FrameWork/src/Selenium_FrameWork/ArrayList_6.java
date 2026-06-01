package Selenium_FrameWork;

import java.util.ArrayList;

public class ArrayList_6 {

	public static void main(String[] args) {

		// Create ArrayList

		ArrayList<Integer> obj1 = new ArrayList<>();

		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);

		System.out.println(obj1);

		for (int a : obj1) {
			if (a == 3) {
				break;

			}
			System.out.println(a);
		}

	}

}
