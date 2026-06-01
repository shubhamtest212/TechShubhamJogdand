package Practices_Codes;

public class Java_9 {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		String op = args[2];

		if (op.equalsIgnoreCase("Sub")) {
			System.out.println("SUB=" + (a - b));
		}
	}

}
