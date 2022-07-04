package br.com.benefrancis.estudos.array;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 100, 24, 13, 44, 114, 200, 40, 112 };
		List<Integer> list = Arrays.asList(arr);
		OptionalDouble average = list.stream().mapToInt(n -> n * n).filter(n -> n > 100).average();
		OptionalDouble average2 = list.stream().mapToInt(n -> n).filter(n -> n > 1).average();

		if (average.isPresent())
			System.out.println(average.getAsDouble());

		String[] str = new String[] { "Bene", "Laine", "Bruno", "Erick", "Davi", "Bene", "Erick", "" };
		List<String> lStr = Arrays.asList(str);
		List<String> opt =  lStr.stream()
								.map(s -> s.toUpperCase()) //Realiza alguma transforma��o
								.filter(s -> !s.isEmpty()) //Realiza algum filtro
								.distinct() //Fun��o para eliminar duplicidades
								.collect(Collectors.toList()); //Transforma em List<>

		String[] ret = opt.toArray(new String[opt.size()]); //Converte para Array

		System.out.println(String.join(", ", ret));
	}
}
