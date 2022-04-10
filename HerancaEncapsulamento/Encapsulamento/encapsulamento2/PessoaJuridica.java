package br.prog2.encapsulamento2;

import br.prog2.encapsulamento1.Cliente;
import br.prog2.encapsulamento1.PessoaFisica;

//Classe PessoaJuiridica
public class PessoaJuridica extends Cliente{
	private String cnpj;
	private String inscricaoEstadual;
	String razaoSocial;
	public String validarCnpj() {
		return "CNPJ validado";
	}
	public void testarVisibilidade() {
		Cliente c = new Cliente();
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		}
}