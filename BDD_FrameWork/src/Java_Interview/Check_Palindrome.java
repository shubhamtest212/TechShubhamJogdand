package Java_Interview;

public class Check_Palindrome {

	public static void main(String[] args) {

		String str = "mmadam";
		String rev = new StringBuilder(str).reverse().toString();

		if (str.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrom");
		}
	}

}
