package br.com.benefrancis.estudos.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeNames {

	public static String[] uniqueNames(String[] names1, String[] names2) {

		List<String> union = new ArrayList<String>();
		union.addAll(Arrays.asList(names1));
		union.addAll(Arrays.asList(names2));

		List<String> distintos = union.stream().distinct().collect(Collectors.toList());
		String[] ret = distintos.toArray(new String[distintos.size()]);

		return ret;
	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma", "Ava" };
		System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2)));
	}
}