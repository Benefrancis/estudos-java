package br.com.benefrancis.reducedphonelist;

import java.util.*;

class ArraySolution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Manager manager = new Manager();
		for (int i = 0; i < N; i++)
			manager.add(in.next());
		in.close();
		System.out.println(manager.total);
	}
}

class Manager {

	class Number {
		Number[] next = new Number[10];
	}

	Number number = new Number();
	int total;

	void add(String telephone) {
		Number cursor = number;

		for (char ch : telephone.toCharArray()) {
			int num = ch - '0';

			if (cursor.next[num] == null) {
				cursor.next[num] = new Number();
				total++;
			}

			cursor = cursor.next[num];
		}
	}
}