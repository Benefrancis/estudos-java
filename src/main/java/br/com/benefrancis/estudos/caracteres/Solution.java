package br.com.benefrancis.estudos.caracteres;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String A = in.nextLine();

		for (int i = 0; i < A.length(); i++) {
			System.out.print("*");
		}

		System.out.println("****");

		System.out.println("* " + A + " *");

		for (int i = 0; i < A.length(); i++) {
			System.out.print("*");
		}
	}
}
