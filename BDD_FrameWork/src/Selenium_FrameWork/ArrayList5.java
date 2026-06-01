package Selenium_FrameWork;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList5 {

	public static void main(String[] args) {

		// Create ArrayList
		ArrayList<String> obj = new ArrayList<String>();

		obj.add("Apple");
		obj.add("Banana");
		obj.add("Apple");
		obj.add("Banana");
		obj.add("Apple");

		System.out.println(obj);

		// HashSet
		HashSet<String> hashlist = new HashSet<String>(obj);

		// ArrayList
		ArrayList<String> arrayList = new ArrayList<String>(hashlist);

		System.out.println("HASHSET : " + hashlist);
		System.out.println("ArrayList : " + arrayList);

	}

}
