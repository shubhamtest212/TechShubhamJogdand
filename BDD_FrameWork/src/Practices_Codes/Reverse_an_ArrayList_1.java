package Practices_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_an_ArrayList_1 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<Object>(Arrays.asList("Jogdand", "Santosh", "Shubham"));

		Collections.reverse(list);

		System.out.println(list);

	}

}
