package br.com.benefrancis.temperatura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * entradas 5 1 -2 -8 4 5
 * 
 * 
 * https://www.codingame.com/forum/t/temperatures-puzzle-discussion/33
 * 
 * 
 * @author Francis
 *
 */

public class ComparatorTemp {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	
		int n = in.nextInt();
	
		List<Integer> intValues = new ArrayList<>();
	
		for (int i = 0; i < n; i++) {
			intValues.add(in.nextInt());
		}
	
		Collections.sort(intValues, Rules::compare);
		
		int res = (n == 0) ? 0 : intValues.get(0);
	
		System.out.println(res);
	
		in.close();
	
	}
	
	private static class Rules {
		private static int compare(Integer t1, Integer t2) {
			if (Math.abs(t1) == Math.abs(t2)) {
				return (t1 > t2) ? -1 : +1;
			} else {
				return Math.abs(t1) - Math.abs(t2);
			}
		}
	}
}
