package br.com.benefrancis.estudos.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio2 {

	/**
	 * Fazer um programa para ler os dados (nome, email e sal�rio) de funcion�rios a
	 * partir de um arquivo em formato .csv.
	 * 
	 * 
	 * Em seguida mostrar, em ordem alfab�tica, o email dos funcion�rios cujo
	 * sal�rio seja superior a um dado valor fornecido pelo usu�rio.
	 * 
	 * Mostrar tamb�m a soma dos sal�rios dos funcion�rios cujo nome come�a com a
	 * letra 'M'
	 * 
	 * * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o caminho do arquivo de funcion�rios: ");

		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Empregado> l = new ArrayList<>();
			String line = br.readLine();

			System.out.println("Informe o sal�rio: ");

			double salario = sc.nextDouble();

			while (line != null) {
				String[] fields = line.split(",");
				l.add(new Empregado(fields[0], fields[1], Double.parseDouble(fields[2])));

				line = br.readLine();
			}

			// @formatter:off
			List<String> emails = l.stream()
					.filter(p -> p.getSalario() >salario)
					.map(p -> p.getEmail())
					.collect(Collectors.toList());
			// @formatter:on

			System.out.println("Email of people whose salary is more than : " + String.format("%.2f", salario));

			emails.forEach(System.out::println);

			// @formatter:off
 			double sum = l.stream()
					.filter(p->p.getNome().toUpperCase().startsWith("B"))
					.map(s -> s.getSalario())
					.reduce(0d, Double::sum);
			// @formatter:on

			System.out.println("Sum of salary of people whose name starts with 'B': " + String.format("%.2f", sum));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
