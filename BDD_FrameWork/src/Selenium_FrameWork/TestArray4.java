package Selenium_FrameWork;

public class TestArray4 {

	public static void main(String[] args) {

		// We can write an array in this way also
		int a[] = { 1, 2, 3, 4, 5 }; // Defining int array
		String b[] = { "SHUBHAM", "SANTOSH", "JOGDAND" }; // Defining string array
		Object c[] = { 12, 6, 199, "TEST", "ENGINEER" }; // Defining object array
		Object d[] = { 2.2, "QAEngineer" }; // Defininf object array
		char e[] = { 'S', 'S', 'J' }; // Defininf char array

		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		System.out.println(d.length);
		System.out.println(e.length);

		System.out.println(a[3]); // 4
		System.out.println(b[1]); // SANTOSH
		System.out.println(c[3]); // TEST
		System.out.println(d[0]); // 2.2
		System.out.println(e[2]); // J

		a[4] = 100;
		System.out.println(a[4]);
		b[0] = "FName";
		System.out.println(b[0]);
		c[3] = "SDETEngineer";
		System.out.println(c[3]);
		d[1] = "TESTENGINEER";
		System.out.println(d[1]);
		e[0] = 's';
		System.out.println(e[0]);

	}

}
