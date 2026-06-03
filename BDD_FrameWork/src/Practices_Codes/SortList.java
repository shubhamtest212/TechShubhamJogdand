package Practices_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(50, 40, 30, 20, 10));

		Collections.sort(list);

		System.out.println(list);

	}

}
