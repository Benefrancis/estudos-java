package br.com.benefrancis.fibonatti;

import java.util.Arrays;
import java.util.stream.Stream;

public class Fibonatti {
	public static void main(String[] args) {
		// Sequencia de fibonatti

		Stream<Long> s4 = Stream.iterate(new Long[] { 0L, 1L }, f -> new Long[] { f[1], f[0] + f[1] }).map(p -> p[0]);

		System.out.println("SEQUÊNCIA DE FIBONATTI: " + Arrays.toString(s4.limit(10).toArray()));

	}
}
