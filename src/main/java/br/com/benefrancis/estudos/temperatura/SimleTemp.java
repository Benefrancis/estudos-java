package br.com.benefrancis.estudos.temperatura;

import java.util.Scanner;
/**
 * https://www.codingame.com/forum/t/temperatures-puzzle-discussion/33
 * @author Francis
 *
 */
public class SimleTemp {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Quantidade de temperaturas que ser�o informadas
		int n = in.nextInt();

		// Se informar 0 iremos imprimir zero, caso seja maior que zero vamos pegar a
		// valor da temperatura at� chegar no n�mero n informado anteriomente.
		int res = (n == 0) ? 0 : in.nextInt();

		// Navego pela quantidade de n�meros e vou pegando os valores da temperatura.
		// n-1 porque o primeiro n�mero informado � a quantidade de temperaturas que
		// ser�o comparadas
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
