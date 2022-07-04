package br.com.benefrancis.estudos.array;

import java.util.Date;

import br.com.benefrancis.estudos.classes.Pessoa;

public class WorkWithScope {
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {

		int o = 10;
		int p = o;
		p = 11;

		System.out.println("O: " + o);
		System.out.println("P: " + p);

		Integer q = 10;
		Integer r = q;
		r = 11;

		System.out.println("Q: " + q);
		System.out.println("R: " + r);

		Pessoa bene = new Pessoa("Benefrancis", new Date(1977, 2, 8));
		Pessoa bruno = bene;
		bruno.setNome("Bruno Sudr�");

		System.out.println("Bene: " + bene);
		System.out.println("Bruno: " + bruno);

		int x = 10;

		if (x > 0) {
			int y = 20;
		}
		System.out.println(x);
		// System.out.println(y); //Erro de Compila��o
	}
}
