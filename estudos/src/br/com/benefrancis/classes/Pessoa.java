package br.com.benefrancis.classes;

import java.util.Date;

public class Pessoa {
	
	String nome;
	Date dtNascimento;
	
	public Pessoa(String nome, Date dtNascimento) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dtNascimento=" + dtNascimento + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	
}
