package br.com.benefrancis.estudos.comparator;

import java.util.ArrayList;
import java.util.List;

import br.com.benefrancis.estudos.classes.Produto;

public class CompararComLambida {
	public static void main(String[] args) {
		List<Produto> l = new ArrayList<>();

		l.add(new Produto("TV", 9000.00));
		l.add(new Produto("Notebook", 1200.00));
		l.add(new Produto("Tablet", 4500.00));
		l.add(new Produto("PS5", 5000.00));
		l.add(new Produto("IPHONE", 13000.00));

		l.sort((p1, p2) -> p1.getNome().trim().toUpperCase().compareTo(p2.getNome().trim().toUpperCase()));

		for (Produto p : l) {
			System.out.println(p);
		}
	}
}
