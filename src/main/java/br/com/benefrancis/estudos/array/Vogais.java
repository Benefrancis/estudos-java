package br.com.benefrancis.estudos.array;

import java.util.Scanner;

public class Vogais {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		
		str.toLowerCase().trim();
		int cont = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'U' || str.charAt(i) == 'O' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'E' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'i') {
				cont++;
			}
			if (str.charAt(i + 1) == ' ') {
				System.out.print(cont);
			}
		}
		System.out.print(cont);
		in.close();
	}
}

/**
 * Input CodinGame rocks Output 4 1
 */