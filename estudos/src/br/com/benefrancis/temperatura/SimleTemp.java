package br.com.benefrancis.temperatura;

import java.util.Scanner;
/**
 * https://www.codingame.com/forum/t/temperatures-puzzle-discussion/33
 * @author Francis
 *
 */
public class SimleTemp {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Quantidade de temperaturas que serão informadas
		int n = in.nextInt();

		// Se informar 0 iremos imprimir zero, caso seja maior que zero vamos pegar a
		// valor da temperatura até chegar no número n informado anteriomente.
		int res = (n == 0) ? 0 : in.nextInt();

		// Navego pela quantidade de números e vou pegando os valores da temperatura.
		// n-1 porque o primeiro número informado é a quantidade de temperaturas que
		// serão comparadas
		for (int i = 0; i < n - 1; i++) {
			// Prox valor de temperatura
			int value = in.nextInt();

			if (Math.abs(value) < Math.abs(res) || value == -res && value > 0) {
				res = value;
			}

		}

		System.out.println(res);
		in.close();

	}
}
