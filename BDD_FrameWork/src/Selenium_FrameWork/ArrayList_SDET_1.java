package Selenium_FrameWork;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_SDET_1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Apple");
		list.add("Mango");

		System.out.println(list.size());

		HashSet<String> list1 = new HashSet<String>(list);

		ArrayList<String> uniqueList = new ArrayList<String>(list1);

		System.out.println("HASHSET LIST : " + list1);
		System.out.println("ARRAYLIST : " + uniqueList);

	}

}
