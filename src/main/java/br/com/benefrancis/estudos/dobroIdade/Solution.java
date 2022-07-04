package br.com.benefrancis.estudos.dobroIdade;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/

/**
 * A idade que o pai ter� quando os filhos tiverem o dobro da idade
 * 
 * @author Francis
 *
 */
class Solution {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int fatherAge = in.nextInt();
		int N = in.nextInt();
		int childAge = 0;

		for (int i = 0; i < N; i++) {
			childAge = in.nextInt();
		}

		while (fatherAge != 2 * childAge) {
			fatherAge += 1;
			childAge += 1;
		}
		
		System.out.println(fatherAge);
		in.close();
	}
}