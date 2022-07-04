package br.com.benefrancis.estudos.abrindoefechando;

import java.util.Scanner;

public class OpenCloseWithLogicalError {

	public static void main(String[] args) {
		// este c�digo, apesar de limpo e curto, n�o est� bom, pois se receber como
		// entrada os seguintes caracteres: {)(}
		// ele retornaria true ou inv�s de false.
		// O problema ocorre porque este c�digo s� verifica se existe a dupla, mas n�o
		// se a ordem da abertura e fechamento ocorrem na ordem.

		Scanner in = new Scanner(System.in);

		String comparar = "";

		String s = in.next().replaceAll("[^\\(\\[\\{\\}\\]\\)]", "");

		if (!comparar.equals(s)) {
			comparar = s;
			s = s.replaceAll("[\\(\\)|\\[\\]|\\{\\}]", "");
		}

		System.out.println(s.equals(""));
		in.close();
	}
}
