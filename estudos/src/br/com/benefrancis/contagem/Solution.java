package br.com.benefrancis.contagem;
import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

		String[] as = input.split("\\s+");

		for(String a: as) {
			System.out.print(a.length()+" ");
		}
		
		in.close();
    }
}