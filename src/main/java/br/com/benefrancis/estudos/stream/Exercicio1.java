package br.com.benefrancis.estudos.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.benefrancis.estudos.prod.Product;

public class Exercicio1 {

	// @formatter:off
 	/**
	 * Fazer um programa para ler um conjunto de produtos 
	 * a partir de uma arquivo em formato .csv
	 * (suponha que exista pelo menos um produto).
	 * 
	 * Em seguida, mostrar o pre�o m�dio dos produtos. 
	 * Depois, mostrar os nomes (em ordem decrescente) dos 
	 * produtos que possuem pre�o inferior ao pre�o m�dio.
	 * @param args
	 */
	// @formatter:on

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> l = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				l.add(new Product(fields[0], Double.parseDouble(fields[1])));

				line = br.readLine();
			}
			// @formatter:off
			// Procesamentos para ver os resultados:
			double avg = l.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / l.size();

			System.out.println("Pre�o M�dio: " + String.format("%.2f", avg));

	
 			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> nomes = l.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			// @formatter:on

			nomes.forEach(System.out::println);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
