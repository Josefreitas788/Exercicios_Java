 package br.prog2.encapsulamento1;

import java.time.LocalDate;

import br.prog2.encapsulamento2.PessoaJuridica;

//Classe PessoaFisica
public class PessoaFisica extends Cliente{
	private String cpf;
	protected String rg;
	public Character sexo;
	LocalDate dataDeNascimento;
	public String validarCpf() {
		return "CPF validado";
	}
	public void testarVisibilidade() {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();	
		Cliente c = new Cliente();
	}
}
