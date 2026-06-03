package Practices_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxElement {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 55, 66, 77));

		System.out.println(Collections.max(list));

	}

}
