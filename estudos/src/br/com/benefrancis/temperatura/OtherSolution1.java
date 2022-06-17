package br.com.benefrancis.temperatura;

import java.util.Scanner;

public class OtherSolution1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of temperatures to analyse
		in.nextLine();
		String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

		String[] t1 = temps.split(" ");

		Integer last = 0;
		boolean allNegative = true;

		if (t1.length > 0) {
			for (String t : t1) {
				try {

					Integer o = Integer.parseInt(t);
					Integer m = Math.abs(o);
					if (last == 0 || last > m)
						last = m;

					if (allNegative == true && o > 0)
						allNegative = false;

				} catch (Exception e) {
				}
			}
		}

		if (last > 0 && allNegative == true)
			last *= -1;

		System.out.println(last.toString());
	}

}
