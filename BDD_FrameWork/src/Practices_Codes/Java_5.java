package Practices_Codes;

import java.util.ArrayList;

public class Java_5 {

	public static void main(String[] args) {

		// ArrayList
		ArrayList<Object> list1 = new ArrayList<>();

		list1.add("Shubham");
		list1.add("Jogdand");
		list1.add("SDETEngineer");

		System.out.println(list1.size());

		for (Object abc : list1) {
			System.out.println(abc);
		}
	}

}
