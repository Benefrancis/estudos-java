package br.com.benefrancis.estudos.somadosdigitos;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long r1 = in.nextInt();
		long r2 = in.nextInt();

		while (r1 != r2) {
			if (r1 < r2) {
				r1 = calcula(r1);
			} else {
				r2 = calcula(r2);
			}
		}
		System.out.println(r1);
		in.close();
	}

	private static long calcula(long n) {
		int sumOfDigits = 0;
		for (char c : String.valueOf(n).toCharArray()) {
			sumOfDigits += (int) c;
		}
		return n + sumOfDigits;
	}
}
