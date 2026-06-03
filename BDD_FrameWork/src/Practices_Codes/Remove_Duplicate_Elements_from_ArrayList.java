package Practices_Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Elements_from_ArrayList {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>(Arrays.asList("1", "2", "3", "1", "2", "3", "4", "4", "45", "55", "55",
				"Shubham", "Santosh", "Jogdand", "Shubham"));

		Set<Object> set = new LinkedHashSet<>(list);

		System.out.println(set);

	}

}
