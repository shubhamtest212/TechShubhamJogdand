package Java_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java_8_Stream_Count_Duplicates {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("QA", "API", "QA", "JAVA");

		Map<String, Long> MAP = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(MAP);

	}

}
