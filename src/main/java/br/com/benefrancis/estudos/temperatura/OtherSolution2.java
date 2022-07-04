package br.com.benefrancis.estudos.temperatura;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class OtherSolution2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of temperatures to analyse
		in.nextLine();
		String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

		String[] temperatures = temps.split(" ");

		Optional<Integer> intermediateResult = 
		  Stream.of(temperatures)
		  		.filter(str -> (str != null && !str.isEmpty()))
				.map(Integer::parseInt)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.minBy(
					new Comparator<Integer>() {
						
						public int compare(Integer int1, Integer int2) {
							return Math.abs(int1) - Math.abs(int2);
						}

					}));

		Integer result = intermediateResult.isPresent() ? intermediateResult.get() : 0;

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(result);
		in.close();
	}
}