package Selenium_FrameWork;

public class TypeCasting {

	public static void main(String[] args) {

		// Narrowing- Manual Type Casting
		// double to int conversion
		double b = 5.9;
		int a = (int) b;
		System.out.println(a); // 5
		System.out.println(b); // 5.9

		// String to int conversion
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);

		// int to String conversion
		int z = 5;
		String t = String.valueOf(z);
		System.out.println(t.length());

		// Widening- Auto casting
		// int to double
		int q = 5;
		double d = q;
		System.out.println(d);
		System.out.println(q);

		// double to String conversion
		String str = String.valueOf(d);
		System.out.println("String Value : " + str);
	}

}
