package br.com.prog2.javaIO;

import br.com.prog2.util.DataPadraoBrasil;

public class Aluno {
	Integer matricula;
	String nome;
	DataPadraoBrasil dataDeNascimento;
	
	public Aluno(Integer matricula, String nome, DataPadraoBrasil dataDeNascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
}