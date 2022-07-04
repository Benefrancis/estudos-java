package br.com.benefrancis.estudos.array;

import java.util.Locale;
import java.util.Scanner;

import br.com.benefrancis.estudos.classes.Produto;

public class WorkWithVector2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Produto[] vet = new Produto[n];

		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();

			vet[i] = new Produto(nome, preco);
		}

		for (Produto p : vet) {
			System.out.println(p);
		}

		double soma = 0.0;

		for (Produto p : vet) {
			soma += p.getPreco();
		}

		System.out.println("SOMA: " + soma);
		System.out.println("M�DIA: " + soma / vet.length);

		sc.close();
	}
}
