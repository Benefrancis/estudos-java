package br.com.benefrancis.estudos.reducedphonelist;

import java.util.HashSet;
import java.util.Scanner;

class VeryShortSolution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		HashSet<String> s = new HashSet<>();

		for (int i = 0; i < N; i++) {
			String temp = in.next();
			for (int j = 0; j < temp.length(); j++)
				s.add(temp.substring(0, j + 1));
		}

		System.out.println(s.size());
		in.close();
	}
}
