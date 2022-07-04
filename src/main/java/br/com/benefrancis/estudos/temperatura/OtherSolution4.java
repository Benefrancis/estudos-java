package br.com.benefrancis.estudos.temperatura;

import java.util.Scanner;

class OtherSolution4 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());
		Integer result = null;

		while (in.hasNextInt()) {
			int temp = in.nextInt();
			result = result == null || Math.abs(temp) < Math.abs(result)
					|| (Math.abs(temp) == Math.abs(result) && temp > 0) ? temp : result;
		}

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(result == null ? 0 : result);
	}
}