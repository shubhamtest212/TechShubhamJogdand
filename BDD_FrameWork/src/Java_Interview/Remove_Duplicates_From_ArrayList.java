package Java_Interview;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicates_From_ArrayList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "A", "C", "B");

		Set<String> set = new LinkedHashSet<>(list);

		System.out.println(set);
	}

}
