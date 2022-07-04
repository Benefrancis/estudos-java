package br.com.benefrancis.estudos.reducedphonelist;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class ShortSolution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		// the task is to count the number of elements needed to store the numbers
		// in a trie structure, which does not require building the trie itself

		// set containing all number prefixes
		Set<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			String telephone = in.next();
			int l = telephone.length();
			StringBuilder sb = new StringBuilder(l);

			// add all prefixes of the number to the set
			for (int k = 0; k < l; k++) {
				sb.append(telephone.charAt(k));
				set.add(sb.toString());
			}
		}

		System.out.println(set.size());
		in.close();
	}
}