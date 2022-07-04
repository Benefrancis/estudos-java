package br.com.benefrancis.estudos.reducedphonelist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class SecondSolution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		List<String> keys = new ArrayList<>(N);
		int total = 0;
		for (int i = 0; i < N; i++) {
			String telephone = in.next();
			int maxPrefixLength = 0;
			int maxKeyIdx = -1;
			boolean insert = true;
			for (int keyIdx = 0; keyIdx < keys.size(); keyIdx++) {
				String key = keys.get(keyIdx);
				if (key.startsWith(telephone)) {
					insert = false;
					break;
				} else if (telephone.startsWith(key)) {
					keys.set(keyIdx, telephone);
					insert = false;
					total += telephone.length() - key.length();
					break;
				}
				// Get common prefix length
				int prefLength = 0;
				for (int j = 0; j < key.length() && j < telephone.length(); j++) {
					if (key.charAt(j) == telephone.charAt(j)) {
						prefLength++;
					} else {
						break;
					}
				}
				if (prefLength > maxPrefixLength) {
					maxPrefixLength = prefLength;
					maxKeyIdx = keyIdx;
				}
			}
			if (insert) {
				total += telephone.length() - maxPrefixLength;
				keys.add(telephone);
			}
		}

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(total); // The number of elements (referencing a number) stored in the structure.
		in.close();
	}
}