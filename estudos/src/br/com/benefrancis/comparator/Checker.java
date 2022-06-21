package br.com.benefrancis.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Write your Checker class here
//score decrescente
//em caso de empate, por ordem alfabetica de nome.

//Criar uma classe chamada Checker que implementa um comparator e im plementar o metodo compare

class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		if (a.score == b.score) {
			return a.name.compareTo(b.name);// alphabetically
		} else {
			return b.score - a.score;// decreasing
		}
	}

}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}

}

class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}