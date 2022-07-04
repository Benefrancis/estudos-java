package br.com.benefrancis.estudos.nec;

import java.util.Arrays;

class Isomorfismo {

	private static boolean DEBUG;

	private static int getCharPosition(final int value, final String str) {
		return str.charAt(value) - 'a';
	}

	static boolean isIsomorphic(final String s, final String t) {

		// @formatter:off
		int lenS = s.length();
		int lenT = t.length();

		// Respondo rapidamente avaliando pelo tamanhp
		if (lenS != lenT) return false;

		// Criando um contador de caracteres [a-z] = 26 chars
		int[] cont1 = new int[26];
		int[] cont2 = new int[26];
		
		if (DEBUG) {
			System.out.printf("%2s%1s%2s%1s%2s%1s%2s%n", 
					"P1", 
					"|", 
					"P2", 
					"|", 
					"S1", 
					"|", 
					"S2");
			System.out.println("--+--|--+--");
		}

		for (int i = 0; i < lenS; i++) {

			cont1[getCharPosition(i, s)]++;
			cont2[getCharPosition(i, t)]++;

			if (DEBUG) {
				System.out.printf("%2d%1s%2d%1s%2s%1s%2s%n", 
						getCharPosition(i, s),
						"|", 
						getCharPosition(i, t), 
						"|",
						s.charAt(i), 
						"|", 
						t.charAt(i));
			}

		}

		if (DEBUG) {
			System.out.println(Arrays.toString(cont1));
			System.out.println(Arrays.toString(cont2));
		}

		/**
		 * Para que duas string sejam consideradas isomorficas � necess�rio que a
		 * quantidade de apari��es de cada caracter seja igual nas duas strings
		 */
		for (int i = 0; i < lenS; i++) {
			if (cont1[getCharPosition(i, s)] != cont2[getCharPosition(i, t)]) {
				return false;
			}
		}
		// @formatter:on
		return true;
	}

	public static void main(String[] args) {
//		System.out.println(isIsomorphic("badc", "babk"));
//		System.out.println(isIsomorphic("badc", "dabk"));
//		System.out.println(isIsomorphic("aba", "xyx"));

		DEBUG = false;
		System.out.println(isIsomorphic("bruno", "sudru"));
		// System.out.println(isIsomorphic("benefrancis", "admdeqzmbhr"));
	}
}