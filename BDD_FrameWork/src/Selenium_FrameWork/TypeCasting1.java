package Selenium_FrameWork;

public class TypeCasting1 {

	public static void main(String[] args) {

		// ===========Narrowing- Manual Type Casting==============//
		// double to int conversion
		double b = 6.9;
		int a = (int) b;
		System.out.println(b); // 6.9
		System.out.println(a); // 6

		// string to int conversion
		String s = "100";
		int i = Integer.parseInt(s);
		System.out.println(i);

		// int to string conversion
		int z = 500;
		String t = String.valueOf(z);
		System.out.println(t.length());
		System.out.println(t);

		// ================Widening/Auto-Casting==================//

		// int to double conversion
		int c = 5;
		double d = c;
		System.out.println(d); // 5.0 double value

		// double to string conversion
		String str = String.valueOf(d);
		System.out.println("String value : " + str);

	}

}
