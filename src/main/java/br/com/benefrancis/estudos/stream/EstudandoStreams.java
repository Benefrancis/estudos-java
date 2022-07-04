package br.com.benefrancis.estudos.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EstudandoStreams {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(3, 5, 8, 10, 15, 6, 9);
		Stream<Integer> s = l.stream().map(e -> e * 10);
		System.out.println(Arrays.toString(s.toArray()));

		Stream<String> s2 = Stream.of("Maria", "Jos�", "Alex", "Benefrancis", "Edilaine", "Bruno", "Erick",
				"Davi Lucca");

		System.out.println(Arrays.toString(s2.toArray()));

		Stream<Integer> s3 = Stream.iterate(0, x -> x + 2);
		System.out.println("SOMA 2 A CADA N�MERO: " + Arrays.toString(s3.limit(100).toArray()));

		// Sequencia de fibonatti

		Stream<Long> s4 = Stream.iterate(new Long[] { 0L, 1L }, f -> new Long[] { f[1], f[0] + f[1] }).map(p -> p[0]);

		System.out.println("SEQU�NCIA DE FIBONATTI: " + Arrays.toString(s4.limit(10).toArray()));

		List<Integer> l2 = Arrays.asList(3, 5, 8, 10, 15, 6, 9);
		Stream<Integer> s5 = l.stream().map(e -> e * 10);
		System.out.println(Arrays.toString(s5.toArray()));

		// Somat�rio da lista
		// A fun��o reduce recebe como par�metros:
		// a) o Elemento neutro do que se deseja fazer; no caso da soma, o zero (se
		// fosse multiplica��o seria o 1);
		// b) como segundo par�metro a fun��o para fazer o que se deseja: Neste caso,
		// navegando pelos elementos e somar o elemento atual com o proximo elemento.
		
		
		//int sum = l2.stream().reduce(0, (x, y) -> x + y);
		//ou
		int sum = l2.stream().reduce(0, Integer::sum);
		System.out.println("SOMA = " + sum);

		
		
		
		//TRabalhando com Pipeline
		// @formatter:off
 		List<Integer> l3 = l2
 				.stream()
				.filter(x -> x % 2 == 0) // filtra somente os n�meros pares
				.map(x -> x * 100) // multiplicou os pares por 100
				.collect(Collectors.toList());
 		// @formatter:on

		System.out.println(Arrays.toString(l3.toArray()));
	}
}
