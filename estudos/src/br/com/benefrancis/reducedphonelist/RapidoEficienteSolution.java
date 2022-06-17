package br.com.benefrancis.reducedphonelist;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * 
 * 5 0412578440 0412199803 0468892011 112 5 output 28
 * 
 * @author Francis
 *
 */
class RapidoEficienteSolution {

	/**
	 * Não devemos utilizar um ArrayList, pois uma ArrayList é apoiada apenas por um
	 * array, o método "contém" busca desde o início até que o valor seja
	 * encontrado, demorando assim bastante tempo.
	 * 
	 * Um Conjunto usa um Hash baseado no objeto para colocá-lo em uma lista em um
	 * índice específico, portanto tanto a inserção quanto a recuperação são muito
	 * rápidas, mas você perde a capacidade de adicionar valores duplicados (que é o
	 * que você não quer neste caso de qualquer forma).
	 */

	static Set<String> substrings = new HashSet<String>();

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			String telephone = in.next();
			for (int j = 1; j < telephone.length() + 1; j++) {
				substrings.add(telephone.substring(0, j));
			}
		}
		System.err.print(substrings);
		System.out.println(substrings.size());
		in.close();
	}
}