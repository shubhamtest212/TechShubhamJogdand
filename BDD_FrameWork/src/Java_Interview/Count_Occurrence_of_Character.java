package Java_Interview;

public class Count_Occurrence_of_Character {

	public static void main(String[] args) {

		String str = "autoaamation";

		char ch = 'a';

		long count = str.chars().filter(c -> c == ch).count();

		System.out.println(count);
	}

}
