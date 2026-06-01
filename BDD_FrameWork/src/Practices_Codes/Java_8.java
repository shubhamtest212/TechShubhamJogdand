package Practices_Codes;

public class Java_8 {

	public static void main(String[] args) {

		// Convert String → int
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		String op = args[2];

		if (op.equalsIgnoreCase("Sum")) {
			System.out.println("Sum = " + (a + b));
		}

	}
}
