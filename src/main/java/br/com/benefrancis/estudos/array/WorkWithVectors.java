package br.com.benefrancis.estudos.array;

import java.util.Locale;
import java.util.Scanner;

public class WorkWithVectors {

	public static void main(String[] args) {
		// fazer um programa para ler um numero inteiro N e a altura de n pessoas
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextDouble();
		}

		sc.close();

		for (double d : vet) {
			System.out.println(d);
		}

		double soma = 0.0;

		for (double d : vet) {
			soma += d;

		}

		System.out.println("SOMA: " + soma);
		System.out.println("M�DIA: " + soma/n);
	}
}
