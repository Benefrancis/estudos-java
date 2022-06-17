package br.com.benefrancis.reversepriority;

import java.util.Scanner;

/**
 * https://www.codingame.com/ide/demo/92954963a9ebe662c48c51b61534ebdc3992e6
 * https://www.codingame.com/contribute/view/104437ccfbf630d235f1da10b853b7076eaff
 * Return the result of the math operation given in parameter.

You will only be asked to perform addition and multiplication.

But be careful! The priority has been mixed between those two operators: the addition operator has a higher priority over the multiplication operator.
 * @author Francis
 *
 */

/**
 * Input A single line containing a mathematical expression using only positive
 * integer numbers, addition operators and multiplication operators. Output The
 * result of the mathematical operation, considering that additions have a
 * higher priority than multiplications. Constraints 0 ≤ expression length ≤ 99
 * 0 ≤ numbers ≤ 999 0 ≤ result ≤ 999'999'999
 * 
 * 
 * input: 5*2+3 -> output: 25
 * 
 * 
 * @author Francis
 *
 */
public class ReversePriority {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String exp = in.nextLine();
		String[] s = exp.split("[*]");
		long prod = 1;
		for (int i = 0; i < s.length; i++) {
			String[] q = s[i].split("[+]");
			int sum = 0;
			for (int j = 0; j < q.length; j++) {
				sum += Integer.parseInt(q[j]);
			}
			prod *= sum;
		}
		System.out.println(prod);
		in.close();
	}
}
