package Selenium_FrameWork;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_SDET_2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("selenium");
		list.add("Java");
		list.add("selenium");
		list.add("Java");

		System.out.println(list.size());

		HashSet<String> hashlist = new HashSet<String>(list);

		ArrayList<String> arrayList = new ArrayList<String>(hashlist);

		System.out.println("HASHLIST : " + hashlist);
		System.out.println("ARRAYLIST : " + arrayList);
	}

}
