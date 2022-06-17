package br.com.benefrancis.abrindoefechando;

import java.util.Scanner;

public class OpenCloseWithLogicalError {

	public static void main(String[] args) {
		// este código, apesar de limpo e curto, não está bom, pois se receber como
		// entrada os seguintes caracteres: {)(}
		// ele retornaria true ou invés de false.
		// O problema ocorre porque este código só verifica se existe a dupla, mas não
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
