package br.com.benefrancis.estudos.array;

import java.util.Scanner;

public class Bit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b1000000;
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("The 6th bit of "+ Integer.toBinaryString(n) +" is true!");
		} else {
			System.out.println("The 6th bit of "+ Integer.toBinaryString(n) +" is false!");
		}
		sc.close();
	}
}
