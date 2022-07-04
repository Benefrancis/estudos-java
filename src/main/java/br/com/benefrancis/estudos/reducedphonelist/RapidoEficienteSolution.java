package br.com.benefrancis.estudos.reducedphonelist;

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
	 * N�o devemos utilizar um ArrayList, pois uma ArrayList � apoiada apenas por um
	 * array, o m�todo "cont�m" busca desde o in�cio at� que o valor seja
	 * encontrado, demorando assim bastante tempo.
	 * 
	 * Um Conjunto usa um Hash baseado no objeto para coloc�-lo em uma lista em um
	 * �ndice espec�fico, portanto tanto a inser��o quanto a recupera��o s�o muito
	 * r�pidas, mas voc� perde a capacidade de adicionar valores duplicados (que � o
	 * que voc� n�o quer neste caso de qualquer forma).
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