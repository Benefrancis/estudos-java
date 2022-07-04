package br.com.benefrancis.estudos.array;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Anagram {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String P = null;
		String Q = null;
		String revP = null;

		for (int i = 0; i < N; i++) {
			P = in.next();
			Q = in.next();
			revP = new StringBuilder(P).reverse().toString();

			if (revP.equalsIgnoreCase(Q)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
		in.close();
	}
}